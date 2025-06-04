package Classes.FileStructure;

import Classes.Statements.StatementNode;

import java.util.List;

public class PlainTsFileNode implements FileNode {
    private final List<StatementNode> statements;

    public PlainTsFileNode(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TypeScript File:\n");

        if (statements != null && !statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {
                sb.append("  Statement #").append(i + 1).append(":\n");
                sb.append("    ").append(statements.get(i).toString().replace("\n", "\n    "));
                if (i < statements.size() - 1) sb.append("\n");
            }
        } else {
            sb.append("  [No statements]");
        }

        return sb.toString();
    }

    // Getter
    public List<StatementNode> getStatements() {
        return statements;
    }
}