// Generated from C:/Users/fawaz/OneDrive/Desktop/For Compiler/Compiler/src/Parsergrammar.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parsergrammar}.
 */
public interface ParsergrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(Parsergrammar.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(Parsergrammar.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#angularComponentFile}.
	 * @param ctx the parse tree
	 */
	void enterAngularComponentFile(Parsergrammar.AngularComponentFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#angularComponentFile}.
	 * @param ctx the parse tree
	 */
	void exitAngularComponentFile(Parsergrammar.AngularComponentFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#plainTsFile}.
	 * @param ctx the parse tree
	 */
	void enterPlainTsFile(Parsergrammar.PlainTsFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#plainTsFile}.
	 * @param ctx the parse tree
	 */
	void exitPlainTsFile(Parsergrammar.PlainTsFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclarationStmt(Parsergrammar.ImportDeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclarationStmt(Parsergrammar.ImportDeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationsStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationsStmt(Parsergrammar.ClassDeclarationsStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationsStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationsStmt(Parsergrammar.ClassDeclarationsStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportVariableDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportVariableDeclarationStmt(Parsergrammar.ExportVariableDeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportVariableDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportVariableDeclarationStmt(Parsergrammar.ExportVariableDeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStmt(Parsergrammar.FunctionCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStmt(Parsergrammar.FunctionCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStmt(Parsergrammar.VariableDeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStmt(Parsergrammar.VariableDeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationStmt(Parsergrammar.MethodDeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationStmt(Parsergrammar.MethodDeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescribeBlockStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeBlockStmt(Parsergrammar.DescribeBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescribeBlockStmt}
	 * labeled alternative in {@link Parsergrammar#plainStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeBlockStmt(Parsergrammar.DescribeBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#templateFile}.
	 * @param ctx the parse tree
	 */
	void enterTemplateFile(Parsergrammar.TemplateFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#templateFile}.
	 * @param ctx the parse tree
	 */
	void exitTemplateFile(Parsergrammar.TemplateFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#styleFile}.
	 * @param ctx the parse tree
	 */
	void enterStyleFile(Parsergrammar.StyleFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#styleFile}.
	 * @param ctx the parse tree
	 */
	void exitStyleFile(Parsergrammar.StyleFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Parsergrammar.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Parsergrammar.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(Parsergrammar.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(Parsergrammar.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclarations(Parsergrammar.ImportDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclarations(Parsergrammar.ImportDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Parsergrammar.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#classDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarations(Parsergrammar.ClassDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#classDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarations(Parsergrammar.ClassDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#exportVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportVariableDeclaration(Parsergrammar.ExportVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#exportVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportVariableDeclaration(Parsergrammar.ExportVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 */
	void enterVariableMember(Parsergrammar.VariableMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 */
	void exitVariableMember(Parsergrammar.VariableMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodMember(Parsergrammar.MethodMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodMember(Parsergrammar.MethodMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorMember(Parsergrammar.DecoratorMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorMember}
	 * labeled alternative in {@link Parsergrammar#classMember}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorMember(Parsergrammar.DecoratorMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Parsergrammar.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Parsergrammar.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Parsergrammar.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Parsergrammar.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Parsergrammar.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Parsergrammar.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parsergrammar.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parsergrammar.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(Parsergrammar.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(Parsergrammar.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(Parsergrammar.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(Parsergrammar.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProp(Parsergrammar.SelectorPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProp(Parsergrammar.SelectorPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProp(Parsergrammar.TemplatePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProp(Parsergrammar.TemplatePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProp(Parsergrammar.TemplateUrlPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProp(Parsergrammar.TemplateUrlPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlProp(Parsergrammar.StyleUrlPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlProp(Parsergrammar.StyleUrlPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProp(Parsergrammar.StandalonePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProp(Parsergrammar.StandalonePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsProp(Parsergrammar.ImportsPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsProp(Parsergrammar.ImportsPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierProp(Parsergrammar.IdentifierPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierProp(Parsergrammar.IdentifierPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterStringProp(Parsergrammar.StringPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringProp}
	 * labeled alternative in {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitStringProp(Parsergrammar.StringPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclStmt(Parsergrammar.VariableDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclStmt(Parsergrammar.VariableDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(Parsergrammar.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(Parsergrammar.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterAwaitStmt(Parsergrammar.AwaitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitAwaitStmt(Parsergrammar.AwaitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCalStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCalStmt(Parsergrammar.FunctionCalStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCalStmt}
	 * labeled alternative in {@link Parsergrammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCalStmt(Parsergrammar.FunctionCalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(Parsergrammar.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(Parsergrammar.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(Parsergrammar.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(Parsergrammar.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Parsergrammar.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Parsergrammar.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Parsergrammar.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Parsergrammar.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpr(Parsergrammar.ObjectLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpr(Parsergrammar.ObjectLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(Parsergrammar.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(Parsergrammar.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAssertionExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertionExpr(Parsergrammar.TypeAssertionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAssertionExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertionExpr(Parsergrammar.TypeAssertionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpr(Parsergrammar.ArrayLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpr(Parsergrammar.ArrayLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(Parsergrammar.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(Parsergrammar.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionExpr(Parsergrammar.ArrowFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionExpr(Parsergrammar.ArrowFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccessExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessExpr(Parsergrammar.PropertyAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccessExpr}
	 * labeled alternative in {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessExpr(Parsergrammar.PropertyAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodChain}.
	 * @param ctx the parse tree
	 */
	void enterMethodChain(Parsergrammar.MethodChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodChain}.
	 * @param ctx the parse tree
	 */
	void exitMethodChain(Parsergrammar.MethodChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(Parsergrammar.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(Parsergrammar.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Parsergrammar.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Parsergrammar.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(Parsergrammar.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(Parsergrammar.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#decoratorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorDeclaration(Parsergrammar.DecoratorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#decoratorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorDeclaration(Parsergrammar.DecoratorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfig(Parsergrammar.ComponentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfig(Parsergrammar.ComponentConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneComponentProperty(Parsergrammar.StandaloneComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneComponentProperty(Parsergrammar.StandaloneComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorComponentProperty(Parsergrammar.SelectorComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorComponentProperty(Parsergrammar.SelectorComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsComponentProperty(Parsergrammar.ImportsComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsComponentProperty(Parsergrammar.ImportsComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateComponentProperty(Parsergrammar.TemplateComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateComponentProperty(Parsergrammar.TemplateComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlComponentProperty(Parsergrammar.TemplateUrlComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlComponentProperty(Parsergrammar.TemplateUrlComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlComponentProperty(Parsergrammar.StyleUrlComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlComponentProperty}
	 * labeled alternative in {@link Parsergrammar#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlComponentProperty(Parsergrammar.StyleUrlComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProperty(Parsergrammar.SelectorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#selectorProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProperty(Parsergrammar.SelectorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#standaloneProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProperty(Parsergrammar.StandalonePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#standaloneProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProperty(Parsergrammar.StandalonePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#importsProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsProperty(Parsergrammar.ImportsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#importsProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsProperty(Parsergrammar.ImportsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#templateProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(Parsergrammar.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#templateProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(Parsergrammar.TemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#templateUrlProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProperty(Parsergrammar.TemplateUrlPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#templateUrlProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProperty(Parsergrammar.TemplateUrlPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#styleUrlProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlProperty(Parsergrammar.StyleUrlPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#styleUrlProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlProperty(Parsergrammar.StyleUrlPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#describeBlock}.
	 * @param ctx the parse tree
	 */
	void enterDescribeBlock(Parsergrammar.DescribeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#describeBlock}.
	 * @param ctx the parse tree
	 */
	void exitDescribeBlock(Parsergrammar.DescribeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(Parsergrammar.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(Parsergrammar.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#describeBody}.
	 * @param ctx the parse tree
	 */
	void enterDescribeBody(Parsergrammar.DescribeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#describeBody}.
	 * @param ctx the parse tree
	 */
	void exitDescribeBody(Parsergrammar.DescribeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#beforeEachBlock}.
	 * @param ctx the parse tree
	 */
	void enterBeforeEachBlock(Parsergrammar.BeforeEachBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#beforeEachBlock}.
	 * @param ctx the parse tree
	 */
	void exitBeforeEachBlock(Parsergrammar.BeforeEachBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#itBlock}.
	 * @param ctx the parse tree
	 */
	void enterItBlock(Parsergrammar.ItBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#itBlock}.
	 * @param ctx the parse tree
	 */
	void exitItBlock(Parsergrammar.ItBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#awaitExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(Parsergrammar.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#awaitExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(Parsergrammar.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#itBody}.
	 * @param ctx the parse tree
	 */
	void enterItBody(Parsergrammar.ItBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#itBody}.
	 * @param ctx the parse tree
	 */
	void exitItBody(Parsergrammar.ItBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#matcherChain}.
	 * @param ctx the parse tree
	 */
	void enterMatcherChain(Parsergrammar.MatcherChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#matcherChain}.
	 * @param ctx the parse tree
	 */
	void exitMatcherChain(Parsergrammar.MatcherChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#expectExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpectExpression(Parsergrammar.ExpectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#expectExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpectExpression(Parsergrammar.ExpectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalHtmlElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalHtmlElement(Parsergrammar.NormalHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalHtmlElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalHtmlElement(Parsergrammar.NormalHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHtmlElement(Parsergrammar.SelfClosingHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHtmlElement(Parsergrammar.SelfClosingHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextContent}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextContent(Parsergrammar.HtmlTextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextContent}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextContent(Parsergrammar.HtmlTextContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(Parsergrammar.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(Parsergrammar.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(Parsergrammar.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(Parsergrammar.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(Parsergrammar.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(Parsergrammar.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(Parsergrammar.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(Parsergrammar.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#textContent}.
	 * @param ctx the parse tree
	 */
	void enterTextContent(Parsergrammar.TextContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#textContent}.
	 * @param ctx the parse tree
	 */
	void exitTextContent(Parsergrammar.TextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Parsergrammar.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Parsergrammar.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(Parsergrammar.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(Parsergrammar.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#cssFile}.
	 * @param ctx the parse tree
	 */
	void enterCssFile(Parsergrammar.CssFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#cssFile}.
	 * @param ctx the parse tree
	 */
	void exitCssFile(Parsergrammar.CssFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#cssComment}.
	 * @param ctx the parse tree
	 */
	void enterCssComment(Parsergrammar.CssCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#cssComment}.
	 * @param ctx the parse tree
	 */
	void exitCssComment(Parsergrammar.CssCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void enterCssAtRule(Parsergrammar.CssAtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void exitCssAtRule(Parsergrammar.CssAtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(Parsergrammar.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(Parsergrammar.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Parsergrammar.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Parsergrammar.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Parsergrammar.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Parsergrammar.ValueContext ctx);
}