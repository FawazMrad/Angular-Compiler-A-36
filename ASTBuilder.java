import Classes.ASTNodeClasses.ComponentSpecific.*;
import Classes.ASTNodeClasses.DeclarationsAndStatements.*;
import Classes.ASTNodeClasses.Expressions.*;
import Classes.ASTNodeClasses.FileStructure.AngularComponentFileNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;
import Classes.ASTNodeClasses.FileStructure.PlainTsFileNode;
import Classes.ASTNodeClasses.HelperStructure.*;
import Classes.ASTNodeClasses.Statements.AssignmentStmtNode;
import Classes.ASTNodeClasses.Statements.FunctionCallStmtNode;
import Classes.ASTNodeClasses.Statements.StatementNode;
import Classes.ASTNodeClasses.Statements.VariableDeclStmtNode;
import Classes.SymbolTableClasses.Rows.*;
import Classes.SymbolTableClasses.Tables.*;
import gen.Parsergrammar;
import gen.ParsergrammarBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;


public class ASTBuilder extends ParsergrammarBaseVisitor<FileNode> {
    private final Deque<String> scopeStack = new ArrayDeque<>();
    private final ImportSymbolTable importSymbolTable;
    private final DecoratorSymbolTable decoratorSymbolTable;
    private final ClassSymbolTable classSymbolTable;
    private final VariableSymbolTable variableSymbolTable;
    private final FunctionSymbolTable functionSymbolTable;
    private String currentDecoratorName = null;
    private String currentFileName;
    private static final String TEST_SCOPE_PREFIX = "test_";

    public ASTBuilder(ImportSymbolTable importSymbolTable, DecoratorSymbolTable decoratorSymbolTable, ClassSymbolTable classSymbolTable, VariableSymbolTable variableSymbolTable, FunctionSymbolTable functionSymbolTable, String fileName) {
        this.importSymbolTable = importSymbolTable;
        this.decoratorSymbolTable = decoratorSymbolTable;
        this.classSymbolTable = classSymbolTable;
        this.variableSymbolTable = variableSymbolTable;
        this.functionSymbolTable = functionSymbolTable;
        scopeStack.push("global");
        this.currentFileName = fileName;
    }

    private String currentScope() {
        return scopeStack.peek();
    }

    private void resetSymbolTables() {
        importSymbolTable.clear();
        decoratorSymbolTable.clear();
        classSymbolTable.clear();
        variableSymbolTable.clear();
        functionSymbolTable.clear();
    }

    private void printSymbolTables() {
        System.out.println("=== Symbol Tables === ");
        importSymbolTable.print();
        decoratorSymbolTable.print();
        classSymbolTable.print();
        variableSymbolTable.print();
        functionSymbolTable.print();
        System.out.println("===============================");
    }

    @Override
    public FileNode visitFile(Parsergrammar.FileContext ctx) {

        resetSymbolTables();

        try {

            if (ctx.angularComponentFile() != null) {
                scopeStack.push("global");
                FileNode result = visitAngularComponentFile(ctx.angularComponentFile());
                scopeStack.pop();
                return result;
            } else if (ctx.plainTsFile() != null) {
                scopeStack.push("global");
                FileNode result = visitPlainTsFile(ctx.plainTsFile());
                scopeStack.pop();
                return result;
            }
            throw new IllegalStateException("Unknown file type");
        } finally {

            printSymbolTables();
        }
    }


    @Override
    public FileNode visitAngularComponentFile(Parsergrammar.AngularComponentFileContext ctx) {
        List<ImportDeclarationNode> imports = processImports(ctx);
        List<ClassDeclarationNode> preDecoratorClasses = new ArrayList<>();
        List<DecoratedClassNode> decoratedClasses = new ArrayList<>();
        List<ClassDeclarationNode> postDecoratorClasses = new ArrayList<>();

        boolean decoratorEncountered = false;

        for (var child : ctx.children) {
            if (child instanceof Parsergrammar.ClassDeclarationContext) {
                ClassDeclarationNode cls = (ClassDeclarationNode) visitClassDeclaration((Parsergrammar.ClassDeclarationContext) child);

                if (!decoratorEncountered) {
                    preDecoratorClasses.add(cls);
                } else {
                    postDecoratorClasses.add(cls);
                }
            } else if (child instanceof Parsergrammar.DecoratorDeclarationContext) {
                decoratorEncountered = true;
                DecoratedClassNode decoratedClass = (DecoratedClassNode) visitDecoratorDeclaration((Parsergrammar.DecoratorDeclarationContext) child);
                decoratedClasses.add(decoratedClass);
            }
        }

        return new AngularComponentFileNode(imports, preDecoratorClasses, decoratedClasses, postDecoratorClasses);
    }

    private List<ImportDeclarationNode> processImports(Parsergrammar.AngularComponentFileContext ctx) {
        List<ImportDeclarationNode> imports = new ArrayList<>();
        if (ctx.importDeclarations() != null) {
            for (Parsergrammar.ImportDeclarationContext importCtx : ctx.importDeclarations().importDeclaration()) {
                ImportDeclarationNode importNode = (ImportDeclarationNode) visitImportDeclaration(importCtx);
                imports.add(importNode);

                for (String importedItem : importNode.getImports()) {
                    importSymbolTable.addRow(new ImportRow(importedItem, importNode.getSource(), importCtx.getStart().getLine(), currentScope()));
                }
            }
        }
        return imports;
    }

    private Map<String, Object> extractDecoratorMetadata(ComponentConfigNode config) {
        Map<String, Object> metadata = new LinkedHashMap<>();

        if (config == null) return metadata;

        for (ComponentPropertyNode property : config.getProperties()) {
            if (property instanceof SelectorPropNode selectorProp) {
                metadata.put("selector", selectorProp.getSelector());
            } else if (property instanceof StandalonePropNode standaloneProp) {
                metadata.put("standalone", standaloneProp.isStandalone());
            } else if (property instanceof ImportsPropNode importsProp) {
                metadata.put("imports", importsProp.getImports().getImports().stream().map(imp -> imp.replaceAll("['\"]", "")).collect(Collectors.toList()));
            } else if (property instanceof TemplatePropNode templateProp) {
                metadata.put("template", templateProp.getTemplate());
            } else if (property instanceof TemplateUrlPropNode templateUrlProp) {
                metadata.put("templateUrl", templateUrlProp.getTemplateUrl());
            } else if (property instanceof StyleUrlPropNode styleUrlProp) {
                metadata.put("styles", styleUrlProp.getStyleUrl());
            }
        }


        metadata.putIfAbsent("standalone", false);
        metadata.putIfAbsent("imports", Collections.emptyList());

        return metadata;
    }


    @Override
    public FileNode visitPlainTsFile(Parsergrammar.PlainTsFileContext ctx) {
        // Process imports
        List<ImportDeclarationNode> imports = new ArrayList<>();
        if (ctx.importDeclarations() != null) {
            ImportDeclarationsNode importsNode = (ImportDeclarationsNode) visit(ctx.importDeclarations());
            imports = importsNode != null ? importsNode.getImports() : Collections.emptyList();
        }

        // Process statements
        List<StatementNode> statements = new ArrayList<>();
        if (ctx.plainStatement() != null) {
            for (Parsergrammar.PlainStatementContext stmtCtx : ctx.plainStatement()) {
                if (stmtCtx != null) {
                    FileNode result = visit(stmtCtx);
                    if (result instanceof StatementNode) {
                        statements.add((StatementNode) result);
                    }
                }
            }
        }

        return new PlainTsFileNode(imports, statements);
    }

    @Override
    public FileNode visitClassDeclarationsStmt(Parsergrammar.ClassDeclarationsStmtContext ctx) {
        List<ClassDeclarationNode> classDeclarations = new ArrayList<>();

        for (Parsergrammar.ClassDeclarationContext classCtx : ctx.classDeclarations().classDeclaration()) {
            boolean isExported = classCtx.EXPORT() != null;
            String className = classCtx.IDENTIFIER(0).getText();

            classSymbolTable.addRow(new Row(className, "class", classCtx.EXTENDS() != null ? classCtx.IDENTIFIER(1).getText() : null, classCtx.getStart().getLine(), currentScope()));

            scopeStack.push(className + ctx.getStart().getLine());

            List<ClassMemberNode> members = new ArrayList<>();
            for (Parsergrammar.ClassMemberContext memberCtx : classCtx.classMember()) {
                ClassMemberNode member = null;
                if (memberCtx instanceof Parsergrammar.VariableMemberContext) {
                    member = (ClassMemberNode) visitVariableMember((Parsergrammar.VariableMemberContext) memberCtx);
                } else if (memberCtx instanceof Parsergrammar.MethodMemberContext) {
                    member = (ClassMemberNode) visitMethodMember((Parsergrammar.MethodMemberContext) memberCtx);
                } else if (memberCtx instanceof Parsergrammar.DecoratorMemberContext) {
                    member = (ClassMemberNode) visitDecoratorMember((Parsergrammar.DecoratorMemberContext) memberCtx);
                }

                if (member != null) {
                    members.add(member);
                }
            }

            scopeStack.pop();

            classDeclarations.add(new ClassDeclarationNode(isExported, className, classCtx.EXTENDS() != null ? classCtx.IDENTIFIER(1).getText() : null, members));
        }

        return new ClassDeclarationsNode(classDeclarations);
    }

    @Override
    public FileNode visitFunctionCallStmt(Parsergrammar.FunctionCallStmtContext ctx) {

        FunctionCallExprNode functionCall = (FunctionCallExprNode) visitFunctionCall(ctx.functionCallStatement().functionCall());


        boolean hasSemicolon = ctx.functionCallStatement().SEMICOLON() != null;


        return new FunctionCallStmtNode(functionCall, hasSemicolon);
    }


    @Override
    public FileNode visitExportVariableDeclarationStmt(Parsergrammar.ExportVariableDeclarationStmtContext ctx) {

        VariableDeclarationNode varDecl = (VariableDeclarationNode) visitVariableDeclaration(ctx.exportVariableDeclaration().variableDeclaration());


        //VariableRow varRow = new VariableRow(varDecl.getIdentifier(), varDecl.isConst() ? "const" : "let", varDecl.getTypeName() != null ? String.join(".", varDecl.getTypeName()) : null, varDecl.getInitializer(), ctx.getStart().getLine(), currentScope(), true);


        //
        //variableSymbolTable.addRow(varRow);

        return new ExportVariableDeclarationNode(varDecl);
    }

    @Override
    public FileNode visitVariableDeclarationStmt(Parsergrammar.VariableDeclarationStmtContext ctx) {

        VariableDeclarationNode varDecl = (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());


        variableSymbolTable.addRow(new VariableRow(varDecl.getIdentifier(), varDecl.isConst() ? "const" : "let", varDecl.getTypeName() != null ? String.join(".", varDecl.getTypeName()) : null, varDecl.getInitializer(), ctx.getStart().getLine(), currentScope(), false));


        return new VariableDeclStmtNode(varDecl);
    }

    @Override
    public FileNode visitMethodDeclarationStmt(Parsergrammar.MethodDeclarationStmtContext ctx) {
        Parsergrammar.MethodDeclarationContext methodCtx = ctx.methodDeclaration();
        String methodName = methodCtx.IDENTIFIER().getText();


        List<ParameterNode> parameters = new ArrayList<>();
        List<Parameter> symbolTableParams = new ArrayList<>();
        if (methodCtx.parameterList() != null) {
            for (Parsergrammar.ParameterContext paramCtx : methodCtx.parameterList().parameter()) {
                ParameterNode paramNode = (ParameterNode) visitParameter(paramCtx);
                parameters.add(paramNode);
                symbolTableParams.add(new Parameter(paramNode.getIdentifier(), paramNode.getTypeName().toString()));
            }
        }


        functionSymbolTable.addRow(new FunctionRow(methodName, "void", symbolTableParams, methodCtx.getStart().getLine(), currentScope()));


        scopeStack.push(methodName);


        BlockNode body = (BlockNode) visitBlock(methodCtx.block());


        scopeStack.pop();

        return new MethodDeclarationNode(methodName, parameters, body);
    }

    @Override
    public FileNode visitImportDeclaration(Parsergrammar.ImportDeclarationContext ctx) {
        if (ctx == null) return null;
        if (ctx.importList() == null || ctx.STRING() == null) return null;

        List<String> imports = new ArrayList<>();
        for (TerminalNode id : ctx.importList().IDENTIFIER()) {
            if (id != null) {
                imports.add(id.getText());
                importSymbolTable.addRow(new ImportRow(id.getText(), ctx.STRING().getText().replaceAll("['\"]", ""), ctx.getStart() != null ? ctx.getStart().getLine() : -1, "global"));
            }
        }

        return new ImportDeclarationNode(imports, ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1));
    }

    @Override
    public FileNode visitImportDeclarations(Parsergrammar.ImportDeclarationsContext ctx) {
        List<ImportDeclarationNode> imports = new ArrayList<>();


        for (Parsergrammar.ImportDeclarationContext importCtx : ctx.importDeclaration()) {
            imports.add((ImportDeclarationNode) visitImportDeclaration(importCtx));
        }


        return new ImportDeclarationsNode(imports);
    }

    @Override
    public FileNode visitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx) {
        if (ctx == null) return null;
        if (ctx.IDENTIFIER() == null || ctx.IDENTIFIER().isEmpty()) return null;

        boolean isExported = ctx.EXPORT() != null;
        String className = ctx.IDENTIFIER(0).getText();
        variableSymbolTable.enterScope(className);
        classSymbolTable.addRow(new Row(className, "class", ctx.EXTENDS() != null && ctx.IDENTIFIER().size() > 1 ? ctx.IDENTIFIER(1).getText() : null, ctx.getStart() != null ? ctx.getStart().getLine() : -1, currentScope()));

        String classScope = "class_" + className + "_" + ctx.getStart().getLine();
        scopeStack.push(classScope);
        List<ClassMemberNode> members = new ArrayList<>();
        if (ctx.classMember() != null) {
            for (Parsergrammar.ClassMemberContext memberCtx : ctx.classMember()) {
                if (memberCtx != null) {
                    ClassMemberNode member = null;
                    if (memberCtx instanceof Parsergrammar.VariableMemberContext) {
                        member = (ClassMemberNode) visitVariableMember((Parsergrammar.VariableMemberContext) memberCtx);
                    } else if (memberCtx instanceof Parsergrammar.MethodMemberContext) {
                        member = (ClassMemberNode) visitMethodMember((Parsergrammar.MethodMemberContext) memberCtx);
                    } else if (memberCtx instanceof Parsergrammar.DecoratorMemberContext) {
                        member = (ClassMemberNode) visitDecoratorMember((Parsergrammar.DecoratorMemberContext) memberCtx);
                    }

                    if (member != null) {
                        members.add(member);
                    }
                }
            }
        }
        scopeStack.pop();
        variableSymbolTable.exitScope();
        return new ClassDeclarationNode(isExported, className, ctx.EXTENDS() != null && ctx.IDENTIFIER().size() > 1 ? ctx.IDENTIFIER(1).getText() : null, members);
    }

    @Override
    public FileNode visitClassDeclarations(Parsergrammar.ClassDeclarationsContext ctx) {
        List<ClassDeclarationNode> declarations = new ArrayList<>();


        for (Parsergrammar.ClassDeclarationContext classCtx : ctx.classDeclaration()) {
            declarations.add((ClassDeclarationNode) visitClassDeclaration(classCtx));
        }

        return new ClassDeclarationsNode(declarations);
    }


    @Override
    public FileNode visitExportVariableDeclaration(Parsergrammar.ExportVariableDeclarationContext ctx) {
        VariableDeclarationNode varDecl = (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());

        // Handle Routes type specially
        String typeName = varDecl.getTypeName() != null ? String.join(".", varDecl.getTypeName()) : null;

        if (typeName != null && typeName.endsWith("Routes")) {
            typeName = "Routes";
        }

        VariableRow varRow = new VariableRow(varDecl.getIdentifier(), varDecl.isConst() ? "const" : "let", typeName, varDecl.getInitializer() != null ? varDecl.getInitializer().toString() : null, ctx.getStart().getLine(), currentScope(), true);

        variableSymbolTable.addRow(varRow);
        return new ExportVariableDeclarationNode(varDecl);
    }

    @Override
    public FileNode visitVariableMember(Parsergrammar.VariableMemberContext ctx) {
        VariableDeclarationNode varDecl = (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());

        // variableSymbolTable.addRow(new VariableRow(varDecl.getIdentifier(), "field", varDecl.getTypeName() != null ? String.join(".", varDecl.getTypeName()) : null, varDecl.getInitializer(), ctx.getStart().getLine(), currentScope(), false));
        return varDecl;
    }


    @Override
    public FileNode visitMethodMember(Parsergrammar.MethodMemberContext ctx) {
        return visitMethodDeclaration(ctx.methodDeclaration());
    }

    @Override
    public FileNode visitDecoratorMember(Parsergrammar.DecoratorMemberContext ctx) {
        return visitDecoratorDeclaration(ctx.decoratorDeclaration());
    }

    @Override
    public FileNode visitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx) {
        if (ctx == null || ctx.IDENTIFIER() == null) return null;

        boolean isConst = ctx.CONST() != null;
        String identifier = ctx.IDENTIFIER().getText();

        // Get declared type from typeName
        List<String> typeParts = null;
        if (ctx.typeName() != null) {
            TypeNameWrapperNode typeWrapper = (TypeNameWrapperNode) visit(ctx.typeName());
            typeParts = typeWrapper.getWrappedTypeName().getParts();
        }

        // Process initializer
        ExpressionNode initializer = null;
        String initializerString = null;
        if (ctx.expression() != null) {
            FileNode exprNode = visit(ctx.expression());
            if (exprNode instanceof ExpressionNode) {
                initializer = (ExpressionNode) exprNode;
                initializerString = serializeExpression(initializer);
            }
        }

        variableSymbolTable.addRow(new VariableRow(identifier, isConst ? "const" : "let", typeParts != null ? String.join(".", typeParts) : "any", initializerString, ctx.getStart() != null ? ctx.getStart().getLine() : -1, currentScope(), false));

        return new VariableDeclarationNode(isConst, identifier, typeParts, initializer);
    }

    private String serializeExpression(ExpressionNode expr) {
        if (expr == null) return null;

        // For symbol table, we just need a basic string representation
        if (expr instanceof LiteralExprNode) {
            return ((LiteralExprNode) expr).getValue().toString();
        }
        return expr.toString();  // Default for other expressions
    }

    @Override
    public FileNode visitRegularType(Parsergrammar.RegularTypeContext ctx) {

        List<String> parts = new ArrayList<>();
        parts.add(ctx.TYPE().getText());
        for (TerminalNode id : ctx.IDENTIFIER()) {
            parts.add(id.getText());
        }
//        return new TypeNameNode(parts);
        return new TypeNameWrapperNode(new TypeNameNode(parts));
    }

    @Override
    public FileNode visitCustomType(Parsergrammar.CustomTypeContext ctx) {
        List<String> parts = new ArrayList<>();
        parts.add(ctx.IDENTIFIER(0).getText());

        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            parts.add(ctx.IDENTIFIER(i).getText());
        }


//        return new TypeNameNode(parts);
        return new TypeNameWrapperNode(new TypeNameNode(parts));
    }


    @Override
    public FileNode visitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx) {
        if (ctx == null || ctx.IDENTIFIER() == null) return null;

        String methodName = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();

        // Get current class scope from scope stack
        String currentClass = scopeStack.stream().filter(scope -> scope.startsWith("class_")).findFirst().orElse("global");

        // Create unique method scope with class context
        String methodScope = currentClass + "_method_" + methodName + "_" + line;

        // Push method scope to both scope stacks
        scopeStack.push(methodScope);
        variableSymbolTable.enterScope(methodScope);

        List<ParameterNode> parameters = new ArrayList<>();
        List<Parameter> symbolTableParams = new ArrayList<>();
        String returnType = "void";

        // Process parameters
        if (ctx.parameterList() != null) {
            for (Parsergrammar.ParameterContext paramCtx : ctx.parameterList().parameter()) {
                if (paramCtx != null) {
                    ParameterNode paramNode = (ParameterNode) visitParameter(paramCtx);
                    if (paramNode != null) {
                        parameters.add(paramNode);
                        String paramType = paramNode.getTypeName() != null ? String.join(".", paramNode.getTypeName().getParts()) : "any";

                        symbolTableParams.add(new Parameter(paramNode.getIdentifier(), paramType));

                        // Add parameter to symbol table with proper method scope
                        variableSymbolTable.addRow(new VariableRow(paramNode.getIdentifier(), "parameter", paramType, null, paramCtx.getStart().getLine(), methodScope,  // Use detailed scope here
                                false));
                    }
                }
            }
        }

        // Add function to symbol table with class context
        functionSymbolTable.addRow(new FunctionRow(methodName, returnType, symbolTableParams, line, currentClass  // Use class scope as parent
        ));

        // Process method body
        BlockNode body = ctx.block() != null ? (BlockNode) visitBlock(ctx.block()) : new BlockNode(Collections.emptyList());

        // Pop method scope from both stacks
        scopeStack.pop();
        variableSymbolTable.exitScope();

        return new MethodDeclarationNode(methodName, parameters, body);
    }

    @Override
    public FileNode visitParameterList(Parsergrammar.ParameterListContext ctx) {
        List<ParameterNode> parameters = new ArrayList<>();
        for (Parsergrammar.ParameterContext paramCtx : ctx.parameter()) {
            parameters.add((ParameterNode) visitParameter(paramCtx));
        }
        return new ParameterListNode(parameters);
    }


    @Override
    public FileNode visitParameter(Parsergrammar.ParameterContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        TypeNameNode typeName = null;

        if (ctx.typeName() != null) {
            // Dispatch to appropriate alternative visitor
            TypeNameWrapperNode typeWrapper = (TypeNameWrapperNode) visit(ctx.typeName());
            typeName = typeWrapper.getWrappedTypeName();
        }

        return new ParameterNode(identifier, typeName);
    }


    @Override
    public FileNode visitArrayLiteral(Parsergrammar.ArrayLiteralContext ctx) {
        if (ctx == null) return null;

        List<ExpressionNode> elements = new ArrayList<>();
        if (ctx.expression() != null) {
            for (Parsergrammar.ExpressionContext exprCtx : ctx.expression()) {
                if (exprCtx != null) {
                    ExpressionNode element = (ExpressionNode) visit(exprCtx);
                    if (element != null) {
                        elements.add(element);
                    }
                }
            }
        }
        return new ArrayLiteralExprNode(elements);
    }

    @Override
    public FileNode visitObjectLiteral(Parsergrammar.ObjectLiteralContext ctx) {
        List<ObjectPropertyNode> properties = new ArrayList<>();
        if (ctx.objectProperty() != null) {
            for (Parsergrammar.ObjectPropertyContext propCtx : ctx.objectProperty()) {
                properties.add((ObjectPropertyNode) visit(propCtx));
            }
        }
        return new ObjectLiteralExprNode(properties);
    }


    @Override
    public FileNode visitVariableDeclStmt(Parsergrammar.VariableDeclStmtContext ctx) {
        VariableDeclarationNode decl = (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
        return new VariableDeclStmtNode(decl);
    }


    @Override
    public FileNode visitImportsProp(Parsergrammar.ImportsPropContext ctx) {

        ExpressionNode exprNode = (ExpressionNode) visit(ctx.expression());


        List<String> imports = new ArrayList<>();

        if (exprNode instanceof ArrayLiteralExprNode) {
            ArrayLiteralExprNode arrayNode = (ArrayLiteralExprNode) exprNode;
            for (ExpressionNode element : arrayNode.getElements()) {
                if (element instanceof LiteralExprNode) {
                    imports.add(((LiteralExprNode) element).getValue().toString());
                }
            }
        }

        return new ImportsPropNode(new ImportListNode(imports));
    }


    @Override
    public FileNode visitFunctionCalStmt(Parsergrammar.FunctionCalStmtContext ctx) {

        return visitFunctionCallStatement(ctx.functionCallStatement());
    }

    @Override
    public FileNode visitFunctionCallStatement(Parsergrammar.FunctionCallStatementContext ctx) {
        FunctionCallExprNode call = (FunctionCallExprNode) visitFunctionCall(ctx.functionCall());
        boolean hasSemicolon = ctx.SEMICOLON() != null;
        return new FunctionCallStmtNode(call, hasSemicolon);
    }

    @Override
    public FileNode visitFunctionCall(Parsergrammar.FunctionCallContext ctx) {
        if (ctx == null) return null;


        if (ctx.IDENTIFIER() != null && "bootstrapApplication".equals(ctx.IDENTIFIER().getText())) {
            List<Parameter> params = new ArrayList<>();


            if (ctx.argumentList() != null) {
                for (Parsergrammar.ExpressionContext argCtx : ctx.argumentList().expression()) {
                    if (argCtx != null) {
                        FileNode argNode = visit(argCtx);
                        if (argNode instanceof ExpressionNode) {
                            String paramType = "any";
                            if (argNode instanceof IdentifierExprNode) {
                                paramType = ((IdentifierExprNode) argNode).getIdentifier();
                            }
                            params.add(new Parameter("param_" + params.size(), paramType));
                        }
                    }
                }
            }

            functionSymbolTable.addRow(new FunctionRow("bootstrapApplication", "Promise<void>", params, ctx.getStart().getLine(), currentScope()));
        }


        ExpressionNode target = ctx.IDENTIFIER() != null ? new IdentifierExprNode(ctx.IDENTIFIER().getText()) : (ExpressionNode) visitPropertyAccess(ctx.propertyAccess());

        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (Parsergrammar.ExpressionContext argCtx : ctx.argumentList().expression()) {
                if (argCtx != null) {
                    FileNode result = visit(argCtx);
                    if (result instanceof ExpressionNode) {
                        arguments.add((ExpressionNode) result);
                    }
                }
            }
        }
        List<MethodChainNode> chains = new ArrayList<>();
        if (ctx.methodChain() != null) {
            for (Parsergrammar.MethodChainContext chainCtx : ctx.methodChain()) {
                if (chainCtx != null) {
                    MethodChainNode chain = (MethodChainNode) visitMethodChain(chainCtx);
                    if (chain != null) {
                        chains.add(chain);
                    }
                }
            }
        }
        return new FunctionCallExprNode(target, arguments, chains);
    }

    @Override
    public FileNode visitOperationalExpr(Parsergrammar.OperationalExprContext ctx) {
        if (ctx.expression(0) != null && ctx.expression(1) != null) {
            ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
            ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
            String operator = ctx.OPERATOR().getText();

            return new OperationalExprNode(left, operator, right);
        }
        return null;
    }

    @Override
    public FileNode visitAssignmentStatement(Parsergrammar.AssignmentStatementContext ctx) {
        ExpressionNode target;

        if (ctx.IDENTIFIER() != null) {
            target = new IdentifierExprNode(ctx.IDENTIFIER().getText());
        } else {
            target = (ExpressionNode) visitPropertyAccess(ctx.propertyAccess());
        }

        ExpressionNode value = (ExpressionNode) visit(ctx.expression());
        return new AssignmentStmtNode(target, value);
    }

    @Override
    public FileNode visitArgumentList(Parsergrammar.ArgumentListContext ctx) {
        List<ExpressionNode> args = new ArrayList<>();
        for (Parsergrammar.ExpressionContext exprCtx : ctx.expression()) {
            args.add((ExpressionNode) visit(exprCtx));
        }
        return new ArgumentListNode(args);
    }


    @Override
    public FileNode visitObjectLiteralExpr(Parsergrammar.ObjectLiteralExprContext ctx) {
        if (ctx == null || ctx.objectLiteral() == null) return null;

        List<ObjectPropertyNode> properties = new ArrayList<>();
        for (Parsergrammar.ObjectPropertyContext propCtx : ctx.objectLiteral().objectProperty()) {
            if (propCtx != null) {
                FileNode node = visit(propCtx);

                properties.add((ObjectPropertyNode) node);


            }
        }
        return new ObjectLiteralExprNode(properties);
    }

    @Override
    public FileNode visitFunctionCallExpr(Parsergrammar.FunctionCallExprContext ctx) {

        return visitFunctionCall(ctx.functionCall());
    }

    @Override
    public FileNode visitTypeAssertionExpr(Parsergrammar.TypeAssertionExprContext ctx) {
        ExpressionNode expression = (ExpressionNode) visit(ctx.expression());

        TypeNameWrapperNode typeWrapper = (TypeNameWrapperNode) visit(ctx.typeName());
        List<String> type = typeWrapper.getWrappedTypeName().getParts();

        return new TypeAssertionExprNode(expression, type);
    }

    @Override
    public FileNode visitArrayLiteralExpr(Parsergrammar.ArrayLiteralExprContext ctx) {
        if (ctx == null || ctx.arrayLiteral() == null) return null;

        List<ExpressionNode> elements = new ArrayList<>();
        for (Parsergrammar.ExpressionContext exprCtx : ctx.arrayLiteral().expression()) {
            if (exprCtx != null) {
                ExpressionNode element = (ExpressionNode) visit(exprCtx);
                if (element != null) {
                    elements.add(element);
                }
            }
        }
        return new ArrayLiteralExprNode(elements);
    }


    @Override
    public FileNode visitLiteralExpr(Parsergrammar.LiteralExprContext ctx) {
        if (ctx == null) return null;
        LiteralExprNode literalExprNode = (LiteralExprNode) visitLiteral(ctx.literal());
        return literalExprNode;
    }


    @Override
    public FileNode visitMethodChain(Parsergrammar.MethodChainContext ctx) {
        if (ctx == null || ctx.IDENTIFIER() == null) {
            return null;
        }

        boolean isSafe = ctx.QUAS() != null;
        String identifier = ctx.IDENTIFIER().getText();


        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (Parsergrammar.ExpressionContext argCtx : ctx.argumentList().expression()) {
                if (argCtx != null) {
                    FileNode result = visit(argCtx);
                    if (result instanceof ExpressionNode) {
                        arguments.add((ExpressionNode) result);
                    }
                }
            }
        }


        if ("catch".equals(identifier)) {

            functionSymbolTable.addRow(new FunctionRow("catch", "void", Collections.singletonList(new Parameter("err", "Error")), ctx.getStart().getLine(), currentScope()));


            variableSymbolTable.addRow(new VariableRow("err", "parameter", "Error", null, ctx.getStart().getLine(), "catch", false));
        }

        return new MethodChainNode(isSafe, identifier, arguments);
    }


    @Override
    public FileNode visitStringProp(Parsergrammar.StringPropContext ctx) {

        String key = ctx.STRING().getText().replaceAll("^['\"]|['\"]$", "");
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());
        return new StringPropNode(key, value);
    }

    @Override
    public FileNode visitIdentifierProp(Parsergrammar.IdentifierPropContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.expression());
        return new IdentifierObjectPropertyNode(identifier, value);
    }

    @Override
    public FileNode visitSelectorProp(Parsergrammar.SelectorPropContext ctx) {

        TerminalNode stringNode = (TerminalNode) ctx.getChild(2);
        String selector = stringNode.getText();


        selector = selector.substring(1, selector.length() - 1);

        return new SelectorPropNode(selector, ctx.getStart().getLine());
    }


    @Override
    public FileNode visitAssignmentStmt(Parsergrammar.AssignmentStmtContext ctx) {
        return visitAssignmentStatement(ctx.assignmentStatement());
    }

    @Override
    public FileNode visitPropertyAccessExpr(Parsergrammar.PropertyAccessExprContext ctx) {
        return visitPropertyAccess(ctx.propertyAccess());
    }

    @Override
    public FileNode visitStandaloneProp(Parsergrammar.StandalonePropContext ctx) {

        TerminalNode boolNode = (TerminalNode) ctx.getChild(2);
        boolean isStandalone = boolNode.getSymbol().getType() == Parsergrammar.TRUE;

        return new StandalonePropNode(isStandalone);
    }

    @Override
    public FileNode visitArrowFunctionExpr(Parsergrammar.ArrowFunctionExprContext ctx) {

        Parsergrammar.ArrowFunctionContext arrowCtx = ctx.arrowFunction();


        String parameter = arrowCtx.IDENTIFIER().getText();


        ExpressionNode body = (ExpressionNode) visit(arrowCtx.expression());


        return new ArrowFunctionExprNode(parameter, body);
    }

    @Override
    public FileNode visitArrowFunction(Parsergrammar.ArrowFunctionContext ctx) {
        String parameter = ctx.IDENTIFIER().getText();


        String arrowScope = "arrow_" + ctx.getStart().getLine();
        scopeStack.push(arrowScope);


        variableSymbolTable.addRow(new VariableRow(parameter, "parameter", null, null, ctx.getStart().getLine(), currentScope(), false));

        ExpressionNode body = (ExpressionNode) visit(ctx.expression());
        scopeStack.pop();

        return new ArrowFunctionExprNode(parameter, body);
    }

    @Override
    public FileNode visitLiteral(Parsergrammar.LiteralContext ctx) {
        String value;
        String type;
        if (ctx.NUMBER() != null) {
            value = ctx.NUMBER().getText();
            type = "number";
        } else if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
            type = "string";
        } else if (ctx.TRUE() != null) {
            value = "true";
            type = "boolean";
        } else if (ctx.FALSE() != null) {
            value = "false";
            type = "boolean";
        } else {
            throw new IllegalStateException("Unknown literal type");
        }

        return new LiteralExprNode(value, type);
    }

    @Override
    public FileNode visitPropertyAccess(Parsergrammar.PropertyAccessContext ctx) {
        if (ctx == null) return null;
        if (ctx.IDENTIFIER() == null || ctx.IDENTIFIER().isEmpty()) return null;

        String base = ctx.IDENTIFIER(0).getText();
        List<PropertyAccessSegmentNode> segments = new ArrayList<>();

        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        for (int i = 1; i < identifiers.size(); i++) {
            TerminalNode id = identifiers.get(i);
            if (id != null) {
                int operatorIndex = 2 * i - 1;
                boolean isSafe = operatorIndex < ctx.getChildCount() && ctx.getChild(operatorIndex).getText().equals("?.");
                String property = id.getText();
                segments.add(new PropertyAccessSegmentNode(isSafe, property));
            }
        }

        return new PropertyAccessExprNode(base, segments);
    }


    @Override
    public DecoratedClassNode visitDecoratorDeclaration(Parsergrammar.DecoratorDeclarationContext ctx) {

        String decoratorName = ctx.IDENTIFIER().getText();
        ComponentConfigNode config = (ComponentConfigNode) visitComponentConfig(ctx.componentConfig());
        DecoratorDeclarationNode decorator = new DecoratorDeclarationNode(decoratorName, config);

        ClassDeclarationNode classNode = (ClassDeclarationNode) visitClassDeclaration(ctx.classDeclaration());
        String className = classNode.getClassName();
        decoratorSymbolTable.addRow(new DecoratorRow(decoratorName, extractDecoratorMetadata(config), ctx.getStart().getLine(), currentScope(), className, currentFileName));

        return new DecoratedClassNode(decorator, classNode);
    }


    @Override
    public FileNode visitComponentConfig(Parsergrammar.ComponentConfigContext ctx) {
        List<ComponentPropertyNode> properties = new ArrayList<>();

        for (Parsergrammar.ComponentPropertyContext propCtx : ctx.componentProperty()) {
            FileNode node = visit(propCtx);
            if (node instanceof ComponentPropertyNode) {
                properties.add((ComponentPropertyNode) node);
            }
        }

        return new ComponentConfigNode(properties);
    }


    @Override
    public FileNode visitStandaloneComponentProperty(Parsergrammar.StandaloneComponentPropertyContext ctx) {
        if (ctx == null || ctx.standaloneProperty() == null) {
            return null;
        }


        boolean isStandalone = ctx.standaloneProperty().TRUE() != null;


        StandalonePropNode propNode = new StandalonePropNode(isStandalone);


        if (currentDecoratorName != null) {
            DecoratorRow decoratorRow = (DecoratorRow) decoratorSymbolTable.lookup(currentDecoratorName);
            if (decoratorRow != null) {
                decoratorRow.addMetadata("standalone", String.valueOf(isStandalone));


                decoratorRow.getMetadata().put("standalone", isStandalone);
            }
        }

        return propNode;
    }

    @Override
    public FileNode visitSelectorComponentProperty(Parsergrammar.SelectorComponentPropertyContext ctx) {
        if (ctx == null || ctx.selectorProperty() == null || ctx.selectorProperty().STRING() == null) {
            return null;
        }


        String selectorText = ctx.selectorProperty().STRING().getText();
        String selectorValue = selectorText.substring(1, selectorText.length() - 1);


        SelectorPropNode selectorNode = new SelectorPropNode(selectorValue, ctx.getStart().getLine());


        if (currentDecoratorName != null) {
            DecoratorRow decoratorRow = (DecoratorRow) decoratorSymbolTable.lookup(currentDecoratorName);
            if (decoratorRow != null) {

                decoratorRow.addMetadata("selector", selectorValue);
                decoratorRow.getMetadata().put("selector", selectorValue);


                if (ctx.selectorProperty().start != null) {
                    decoratorRow.setLineNumber(ctx.selectorProperty().start.getLine());
                }
            }
        }

        return selectorNode;
    }

    @Override
    public FileNode visitImportsComponentProperty(Parsergrammar.ImportsComponentPropertyContext ctx) {
        if (ctx == null || ctx.importsProperty() == null || ctx.importsProperty().importList() == null) {
            return null;
        }


        ImportListNode importList = (ImportListNode) visit(ctx.importsProperty().importList());
        if (importList == null) {
            System.err.println("Warning: importList is null in ImportsComponentProperty");
            return null;
        }


        ImportsPropNode importsNode = new ImportsPropNode(importList);


        if (currentDecoratorName != null) {
            DecoratorRow decoratorRow = (DecoratorRow) decoratorSymbolTable.lookup(currentDecoratorName);
            if (decoratorRow != null) {
                decoratorRow.getMetadata().put("imports", importList.getImports());
                decoratorRow.addMetadata("imports", importList.getImports().toString());

                if (ctx.importsProperty().start != null) {
                    decoratorRow.setLineNumber(ctx.importsProperty().start.getLine());
                }
            }
        }

        return importsNode;
    }

    @Override
    public FileNode visitTemplateComponentProperty(Parsergrammar.TemplateComponentPropertyContext ctx) {
        if (ctx == null || ctx.templateProperty() == null) {
            return null;
        }


        String templateContent;
        if (ctx.templateProperty().TEMPLATE_LITERAL_STRING() != null) {

            templateContent = ctx.templateProperty().TEMPLATE_LITERAL_STRING().getText();
            templateContent = templateContent.substring(1, templateContent.length() - 1);
        } else if (ctx.templateProperty().STRING() != null) {

            templateContent = ctx.templateProperty().STRING().getText();
            templateContent = templateContent.substring(1, templateContent.length() - 1);
        } else {
            return null;
        }


        TemplatePropNode templateNode = new TemplatePropNode(templateContent);


        if (currentDecoratorName != null) {
            DecoratorRow decoratorRow = (DecoratorRow) decoratorSymbolTable.lookup(currentDecoratorName);
            if (decoratorRow != null) {

                decoratorRow.getMetadata().put("template", templateContent);
                decoratorRow.addMetadata("template_preview", templateContent.length() > 50 ? templateContent.substring(0, 47) + "..." : templateContent);


                if (ctx.templateProperty().start != null) {
                    decoratorRow.setLineNumber(ctx.templateProperty().start.getLine());
                }
            }
        }

        return templateNode;
    }

    @Override
    public FileNode visitTemplateUrlComponentProperty(Parsergrammar.TemplateUrlComponentPropertyContext ctx) {
        if (ctx == null || ctx.templateUrlProperty() == null || ctx.templateUrlProperty().STRING() == null) {
            return null;
        }


        String rawUrl = ctx.templateUrlProperty().STRING().getText();
        String templateUrl = rawUrl.substring(1, rawUrl.length() - 1);


        TemplateUrlPropNode templateUrlNode = new TemplateUrlPropNode(templateUrl);


        if (currentDecoratorName != null) {
            DecoratorRow decoratorRow = (DecoratorRow) decoratorSymbolTable.lookup(currentDecoratorName);
            if (decoratorRow != null) {
                decoratorRow.getMetadata().put("templateUrl", templateUrl);
                decoratorRow.addMetadata("templateUrl", templateUrl);


                decoratorRow.setLineNumber(ctx.templateUrlProperty().start.getLine());

            }
        }

        return templateUrlNode;
    }

    private boolean isValidTemplateUrl(String url) {

        return url.endsWith(".html") && !url.contains("..");
    }

    @Override
    public FileNode visitStyleUrlComponentProperty(Parsergrammar.StyleUrlComponentPropertyContext ctx) {
        if (ctx == null || ctx.styleUrlProperty() == null || ctx.styleUrlProperty().STRING() == null) {
            return null;
        }


        String rawUrl = ctx.styleUrlProperty().STRING().getText();
        String styleUrl = rawUrl.substring(1, rawUrl.length() - 1);


        StyleUrlPropNode styleUrlNode = new StyleUrlPropNode(styleUrl);


        if (currentDecoratorName != null) {
            DecoratorRow decoratorRow = (DecoratorRow) decoratorSymbolTable.lookup(currentDecoratorName);
            if (decoratorRow != null) {

                decoratorRow.getMetadata().put("styleUrls", decoratorRow.getMetadata().getOrDefault("styleUrls", new ArrayList<>()));
                ((List<String>) decoratorRow.getMetadata().get("styleUrls")).add(styleUrl);
                decoratorRow.addMetadata("styleUrl_" + System.currentTimeMillis(), styleUrl);


                decoratorRow.setLineNumber(ctx.styleUrlProperty().start.getLine());

            }
        }

        return styleUrlNode;
    }

    private boolean isValidStyleUrl(String url) {

        return (url.endsWith(".css") || url.endsWith(".scss")) && !url.contains("..");
    }

    @Override
    public FileNode visitSelectorProperty(Parsergrammar.SelectorPropertyContext ctx) {

        String selector = ctx.STRING().getText();
        selector = selector.substring(1, selector.length() - 1);

        return new SelectorPropNode(selector, ctx.getStart().getLine());
    }

    @Override
    public FileNode visitStandaloneProperty(Parsergrammar.StandalonePropertyContext ctx) {

        boolean isStandalone = ctx.TRUE() != null;

        return new StandalonePropNode(isStandalone);
    }

    @Override
    public FileNode visitImportsProperty(Parsergrammar.ImportsPropertyContext ctx) {

        List<String> imports = new ArrayList<>();
        for (TerminalNode id : ctx.importList().IDENTIFIER()) {
            imports.add(id.getText());
        }
        ImportListNode importList = new ImportListNode(imports);
        return new ImportsPropNode(importList);
    }

    @Override
    public FileNode visitFunctionExpression(Parsergrammar.FunctionExpressionContext ctx) {
        boolean isAsync = ctx.ASYNC() != null;
        boolean hasParentheses = ctx.LPAREN() != null;
        return new FunctionExpressionNode(isAsync, hasParentheses);
    }

    @Override
    public FileNode visitMatcherChain(Parsergrammar.MatcherChainContext ctx) {
        String matcherType;
        if (ctx.TO_BE_TRUTHY() != null) {
            matcherType = "toBeTruthy";
        } else if (ctx.TO_EQUAL() != null) {
            matcherType = "toEqual";
        } else if (ctx.TO_CONTAIN() != null) {
            matcherType = "toContain";
        } else {
            throw new IllegalStateException("Unknown matcher type");
        }

        ExpressionNode expectedValue = null;
        if (ctx.expression() != null) {
            expectedValue = (ExpressionNode) visit(ctx.expression());
        }

//        return new MatcherChainNode(matcherType, expectedValue);
        return null;
    }

    //    @Override
//    public FileNode visitExpectExpression(Parsergrammar.ExpectExpressionContext ctx) {
//        ExpressionNode actualValue = (ExpressionNode) visit(ctx.expression());
//        MatcherChainNode matcher = (MatcherChainNode) visitMatcherChain(ctx.matcherChain());
//        return new ExpectExpressionNode(actualValue, matcher);
//    }
    private boolean isInTestScope() {
        return scopeStack.stream().anyMatch(scope -> scope.startsWith(TEST_SCOPE_PREFIX));
    }

    @Override
    public FileNode visitExpectExpression(Parsergrammar.ExpectExpressionContext ctx) {
        return null;
    }

    @Override
    public FileNode visitBlock(Parsergrammar.BlockContext ctx) {

        String blockScope = "block_" + ctx.getStart().getLine();
        scopeStack.push(blockScope);
        variableSymbolTable.enterScope(blockScope);
        List<StatementNode> statements = new ArrayList<>();
        for (Parsergrammar.StatementContext stmtCtx : ctx.statement()) {
            statements.add((StatementNode) visit(stmtCtx));
        }

        scopeStack.pop();
        variableSymbolTable.exitScope();
        return new BlockNode(statements);
    }


    @Override
    public FileNode visitAttribute(Parsergrammar.AttributeContext ctx) {
        return super.visitAttribute(ctx);
    }

    @Override
    public FileNode visitRuleset(Parsergrammar.RulesetContext ctx) {
        return super.visitRuleset(ctx);
    }

    @Override
    public FileNode visitDeclaration(Parsergrammar.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public FileNode visitValue(Parsergrammar.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public FileNode visitTemplateProperty(Parsergrammar.TemplatePropertyContext ctx) {
        return super.visitTemplateProperty(ctx);
    }

    @Override
    public FileNode visitTemplateUrlProperty(Parsergrammar.TemplateUrlPropertyContext ctx) {
        return super.visitTemplateUrlProperty(ctx);
    }

    @Override
    public FileNode visitStyleUrlProperty(Parsergrammar.StyleUrlPropertyContext ctx) {
        return super.visitStyleUrlProperty(ctx);
    }

    @Override
    public FileNode visitTemplateProp(Parsergrammar.TemplatePropContext ctx) {
        return super.visitTemplateProp(ctx);
    }

    @Override
    public FileNode visitTemplateUrlProp(Parsergrammar.TemplateUrlPropContext ctx) {
        return super.visitTemplateUrlProp(ctx);
    }

    @Override
    public FileNode visitStyleUrlProp(Parsergrammar.StyleUrlPropContext ctx) {
        return super.visitStyleUrlProp(ctx);
    }

    @Override
    public FileNode visitImportList(Parsergrammar.ImportListContext ctx) {
        if (ctx == null || ctx.IDENTIFIER().isEmpty()) {

            return new ImportListNode(Collections.emptyList());
        }

        List<String> importItems = new ArrayList<>();
        for (TerminalNode id : ctx.IDENTIFIER()) {
            importItems.add(id.getText());
        }

        return new ImportListNode(importItems);
    }


    @Override
    public FileNode visitDescribeBlockStmt(Parsergrammar.DescribeBlockStmtContext ctx) {
        String describeScope = TEST_SCOPE_PREFIX + "describe_" + ctx.getStart().getLine();
        scopeStack.push(describeScope);
        scopeStack.pop();
        return null;
    }

    @Override
    public FileNode visitTemplateFile(Parsergrammar.TemplateFileContext ctx) {
        return super.visitTemplateFile(ctx);
    }

    @Override
    public FileNode visitStyleFile(Parsergrammar.StyleFileContext ctx) {
        return super.visitStyleFile(ctx);
    }

    @Override
    public FileNode visitAwaitStmt(Parsergrammar.AwaitStmtContext ctx) {
        return super.visitAwaitStmt(ctx);
    }

    @Override
    public FileNode visitCssAtRule(Parsergrammar.CssAtRuleContext ctx) {
        return super.visitCssAtRule(ctx);
    }

    @Override
    public FileNode visitCssComment(Parsergrammar.CssCommentContext ctx) {
        return super.visitCssComment(ctx);
    }

    @Override
    public FileNode visitCssFile(Parsergrammar.CssFileContext ctx) {
        return super.visitCssFile(ctx);
    }

    @Override
    public FileNode visitComment(Parsergrammar.CommentContext ctx) {
        return super.visitComment(ctx);
    }

    @Override
    public FileNode visitSelfClosingTag(Parsergrammar.SelfClosingTagContext ctx) {
        return super.visitSelfClosingTag(ctx);
    }

    @Override
    public FileNode visitCloseTag(Parsergrammar.CloseTagContext ctx) {
        return super.visitCloseTag(ctx);
    }

    @Override
    public FileNode visitOpenTag(Parsergrammar.OpenTagContext ctx) {
        return super.visitOpenTag(ctx);
    }

    @Override
    public FileNode visitHtmlComment(Parsergrammar.HtmlCommentContext ctx) {
        return super.visitHtmlComment(ctx);
    }

    @Override
    public FileNode visitHtmlTextContent(Parsergrammar.HtmlTextContentContext ctx) {
        return super.visitHtmlTextContent(ctx);
    }

    @Override
    public FileNode visitSelfClosingHtmlElement(Parsergrammar.SelfClosingHtmlElementContext ctx) {
        return super.visitSelfClosingHtmlElement(ctx);
    }

    @Override
    public FileNode visitNormalHtmlElement(Parsergrammar.NormalHtmlElementContext ctx) {
        return super.visitNormalHtmlElement(ctx);
    }

    @Override
    public FileNode visitTextContent(Parsergrammar.TextContentContext ctx) {
        return super.visitTextContent(ctx);
    }

    @Override
    public FileNode visitItBody(Parsergrammar.ItBodyContext ctx) {
        return super.visitItBody(ctx);
    }

    @Override
    public FileNode visitAwaitExpression(Parsergrammar.AwaitExpressionContext ctx) {
        return super.visitAwaitExpression(ctx);
    }

    @Override
    public FileNode visitItBlock(Parsergrammar.ItBlockContext ctx) {
        String itScope = TEST_SCOPE_PREFIX + "it_" + ctx.getStart().getLine();
        scopeStack.push(itScope);
        scopeStack.pop();
        return null;
    }

    @Override
    public FileNode visitBeforeEachBlock(Parsergrammar.BeforeEachBlockContext ctx) {
        String beforeEachScope = TEST_SCOPE_PREFIX + "beforeEach_" + ctx.getStart().getLine();
        scopeStack.push(beforeEachScope);
        scopeStack.pop();
        return null;
    }

    @Override
    public FileNode visitDescribeBody(Parsergrammar.DescribeBodyContext ctx) {
        return super.visitDescribeBody(ctx);
    }

    @Override
    public FileNode visitDescribeBlock(Parsergrammar.DescribeBlockContext ctx) {
        return super.visitDescribeBlock(ctx);
    }
}
