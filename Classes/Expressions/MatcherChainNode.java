package Classes.Expressions;

public class MatcherChainNode implements ExpressionNode {
    private final String matcherType;
    private final ExpressionNode expectedValue;

    public MatcherChainNode(String matcherType, ExpressionNode expectedValue) {
        this.matcherType = matcherType;
        this.expectedValue = expectedValue;
    }

    @Override
    public String toString() {
        return "." + matcherType + "(" + (expectedValue != null ? expectedValue : "") + ")";
    }

    // Getters
    public String getMatcherType() { return matcherType; }
    public ExpressionNode getExpectedValue() { return expectedValue; }
}