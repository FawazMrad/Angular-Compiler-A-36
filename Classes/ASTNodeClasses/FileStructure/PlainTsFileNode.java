package Classes.ASTNodeClasses.FileStructure;

import Classes.ASTNodeClasses.Statements.StatementNode;

import java.util.List;
import Classes.ASTNodeClasses.DeclarationsAndStatements.ImportDeclarationNode;
import Classes.ASTNodeClasses.Statements.StatementNode;

import java.util.List;

public class PlainTsFileNode implements FileNode {
    private final List<ImportDeclarationNode> imports;
    private final List<StatementNode> statements;

    public PlainTsFileNode(List<ImportDeclarationNode> imports, List<StatementNode> statements) {
        this.imports = imports;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TypeScript File:\n");

        // Add imports section
        if (imports != null && !imports.isEmpty()) {
            sb.append("  Imports:\n");
            for (ImportDeclarationNode imp : imports) {
                sb.append("    ").append(imp.toString().replace("\n", "\n    ")).append("\n");
            }
        }

        // Add statements section
        if (statements != null && !statements.isEmpty()) {
            sb.append("  Statements:\n");
            for (int i = 0; i < statements.size(); i++) {
                sb.append("    Statement #").append(i + 1).append(":\n");
                sb.append("      ").append(statements.get(i).toString().replace("\n", "\n      "));
                if (i < statements.size() - 1) sb.append("\n");
            }
        } else {
            sb.append("  [No statements]");
        }

        return sb.toString();
    }

    // Getters
    public List<ImportDeclarationNode> getImports() {
        return imports;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }
}