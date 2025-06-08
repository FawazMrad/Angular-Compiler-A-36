package Classes.ASTNodeClasses.HelperStructure;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;

import java.util.List;

public class MethodChainNode implements FileNode {
    private final boolean safe;
    private final String identifier;
    private final List<ExpressionNode> arguments;

    public MethodChainNode(boolean safe, String identifier, List<ExpressionNode> arguments) {
        this.safe = safe;
        this.identifier = identifier;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(safe ? "?." : ".")
                .append(identifier);

        if (arguments != null && !arguments.isEmpty()) {
            sb.append("(");
            for (int i = 0; i < arguments.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(arguments.get(i));
            }
            sb.append(")");
        }

        return sb.toString();
    }

    public boolean isSafe() {
        return safe;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }
}