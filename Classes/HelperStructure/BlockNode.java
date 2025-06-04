package Classes.HelperStructure;

import Classes.FileStructure.FileNode;
import Classes.Statements.StatementNode;

import java.util.List;

public class BlockNode implements FileNode {
    private final List<StatementNode> statements;

    public BlockNode(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        for (StatementNode stmt : statements) {
            sb.append("  ").append(stmt.toString().replace("\n", "\n  ")).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public List<StatementNode> getStatements() {
        return statements;
    }
}