package Classes.ASTNodeClasses.Expressions;

public class FunctionExpressionNode implements ExpressionNode {
    private final boolean isAsync;
    private final boolean hasParentheses;

    public FunctionExpressionNode(boolean isAsync, boolean hasParentheses) {
        this.isAsync = isAsync;
        this.hasParentheses = hasParentheses;
    }

    @Override
    public String toString() {
        return (isAsync ? "async " : "") +
                (hasParentheses ? "()" : "") +
                " => ";
    }

    // Getters
    public boolean isAsync() { return isAsync; }
    public boolean hasParentheses() { return hasParentheses; }
}