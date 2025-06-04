package Classes.Expressions;

public class ExpectExpressionNode implements ExpressionNode {
    private final ExpressionNode actualValue;
    private final MatcherChainNode matcher;

    public ExpectExpressionNode(ExpressionNode actualValue, MatcherChainNode matcher) {
        this.actualValue = actualValue;
        this.matcher = matcher;
    }

    @Override
    public String toString() {
        return "expect(" + actualValue + ")" + matcher;
    }

    // Getters
    public ExpressionNode getActualValue() { return actualValue; }
    public MatcherChainNode getMatcher() { return matcher; }
}