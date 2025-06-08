import Classes.ASTNodeClasses.FileStructure.FileNode;
import Classes.ErrorHandling.ErrorReporter;
import Classes.ErrorHandling.SemanticChecks.AngularChecks.*;
import Classes.ErrorHandling.SemanticChecks.TypeScriptChecks.TypeMismatchCheck;
import Classes.ErrorHandling.SemanticChecks.TypeScriptChecks.VariableRedeclarationAndConstReassignmentCheck;
import Classes.SymbolTableClasses.Tables.*;
import gen.Lexergrammar;
import gen.Parsergrammar;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String validPath="src/Tests/ValidTests";   //ts files without errors(the actual project)
        String notValidPath="src/Tests/NotValidTests";  // ts files with errors for testing the error handling

        List<Path> tsFiles = Files.walk(Paths.get(validPath))
                .filter(p -> p.toString().endsWith(".ts"))
                .collect(Collectors.toList());

        // 3. Parse ALL files and populate symbol tables
        for (Path tsFile : tsFiles) {

            String fileName = tsFile.getFileName().toString();
            // 2. Initialize GLOBAL symbol tables (ONCE)
            ImportSymbolTable importTable = new ImportSymbolTable(fileName);
            DecoratorSymbolTable decoratorTable = new DecoratorSymbolTable(fileName);
            ClassSymbolTable classTable = new ClassSymbolTable(fileName);
            VariableSymbolTable varTable = new VariableSymbolTable(fileName);
            FunctionSymbolTable funcTable = new FunctionSymbolTable(fileName);


            CharStream cs = fromFileName(tsFile.toString());
            Lexergrammar lexer = new Lexergrammar(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Parsergrammar parser = new Parsergrammar(tokens);

            ASTBuilder astBuilder = new ASTBuilder(importTable, decoratorTable,
                    classTable, varTable, funcTable, fileName);
            System.out.println("***************************************************************");
            System.out.println("===========Parsing the file: " + fileName + "===========");
            FileNode ast = astBuilder.visit(parser.file());

            System.out.println("=== AST for " + fileName + " ===");
            System.out.println(ast);

            // 4. Run ALL semantic checks (with complete project context)
            MissingRequiredMetadataPropertyCheck componentCheck = new MissingRequiredMetadataPropertyCheck(decoratorTable);
            componentCheck.check();
            DuplicateSelectorCheck selectorCheck = new DuplicateSelectorCheck(decoratorTable);
            selectorCheck.check();
            TemplateMutualExclusionCheck templateMutualExclusionCheck=new TemplateMutualExclusionCheck(decoratorTable);
            templateMutualExclusionCheck.check();
            TemplateAndStyleUrlValidationCheck templateAndStyleUrlValidationCheck =new TemplateAndStyleUrlValidationCheck(decoratorTable);
            templateAndStyleUrlValidationCheck.check();
            VariableRedeclarationAndConstReassignmentCheck variableRedeclarationAndConstReassignmentCheck =new VariableRedeclarationAndConstReassignmentCheck(varTable);
            variableRedeclarationAndConstReassignmentCheck.check();
            TypeMismatchCheck typeMismatchCheck=new TypeMismatchCheck(varTable);
            typeMismatchCheck.check();
            ComponentSelectorCheck componentSelectorCheck=new ComponentSelectorCheck(decoratorTable);
            componentSelectorCheck.check();
            StandaloneComponentImportsCheck standaloneComponentImportsCheck=new StandaloneComponentImportsCheck(decoratorTable);
            standaloneComponentImportsCheck.check();
            // 5. Write all errors at the end
            ErrorReporter.writeToFile();
        }


    }
}

