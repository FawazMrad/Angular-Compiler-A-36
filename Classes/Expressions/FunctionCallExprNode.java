package Classes.Expressions;

import Classes.FileStructure.FileNode;
import Classes.HelperStructure.MethodChainNode;

import java.util.List;

public class FunctionCallExprNode implements ExpressionNode {
    private final ExpressionNode target;
    private final List<ExpressionNode> arguments;
    private final List<MethodChainNode> chains;

    public FunctionCallExprNode(ExpressionNode target,
                                List<ExpressionNode> arguments,
                                List<MethodChainNode> chains) {
        this.target = target;
        this.arguments = arguments;
        this.chains = chains;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(target.toString())
                .append("(");

        if (arguments != null) {
            for (int i = 0; i < arguments.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(arguments.get(i));
            }
        }

        sb.append(")");

        if (chains != null) {
            for (MethodChainNode chain : chains) {
                sb.append(chain);
            }
        }

        return sb.toString();
    }

    public ExpressionNode getTarget() {
        return target;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public List<MethodChainNode> getChains() {
        return chains;
    }
}