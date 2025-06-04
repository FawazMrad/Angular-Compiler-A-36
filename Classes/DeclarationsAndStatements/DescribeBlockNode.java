package Classes.DeclarationsAndStatements;

import Classes.Expressions.FunctionExpressionNode;
import Classes.FileStructure.FileNode;
import Classes.Statements.StatementNode;

import java.util.List;

public class DescribeBlockNode implements FileNode {
    private final String description;
    private final FunctionExpressionNode callback;
    private final List<StatementNode> body;

    public DescribeBlockNode(String description,
                             FunctionExpressionNode callback,
                             List<StatementNode> body) {
        this.description = description;
        this.callback = callback;
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("describe(")
                .append(description)
                .append(", ")
                .append(callback)
                .append(" {\n");

        for (StatementNode stmt : body) {
            sb.append("  ").append(stmt.toString().replace("\n", "\n  ")).append("\n");
        }

        sb.append("});");
        return sb.toString();
    }

    // Getters
    public String getDescription() { return description; }
    public FunctionExpressionNode getCallback() { return callback; }
    public List<StatementNode> getBody() { return body; }
}