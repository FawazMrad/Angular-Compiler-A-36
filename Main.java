import Classes.FileStructure.FileNode;
import Classes.SymbolTable.Tables.*;
import gen.Lexergrammar;
import gen.Parsergrammar;
import org.antlr.v4.codegen.model.BaseVisitorFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {
        String source = "src/Tests/ValidTests/app/app.component.ts";
//        String source ="src/Tests/ValidTests/app/app.component.spec.ts";
//        String source ="src/Tests/ValidTests/app/app.config.ts";
//        String source ="src/Tests/ValidTests/app/app.routes.ts";

        // Initialize symbol tables
        ImportSymbolTable importTable = new ImportSymbolTable();
        DecoratorSymbolTable decoratorTable = new DecoratorSymbolTable();
        ClassSymbolTable classTable = new ClassSymbolTable();
        VariableSymbolTable varTable = new VariableSymbolTable();
        FunctionSymbolTable funcTable = new FunctionSymbolTable();

        // Setup ANTLR
        CharStream cs = fromFileName(source);
        Lexergrammar lexer = new Lexergrammar(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parsergrammar parser = new Parsergrammar(tokens);

        // Create and use visitor
        ASTBuilder astBuilder = new ASTBuilder(importTable, decoratorTable,
                classTable, varTable, funcTable);
        FileNode ast = astBuilder.visit(parser.file());

        // Print results
        System.out.println("=== AST ===");
        System.out.println(ast);
    }
}