package Classes.Expressions;

import java.util.List;

public class TypeAssertionExprNode implements ExpressionNode {
    private final ExpressionNode expression;
    private final List<String> type;

    public TypeAssertionExprNode(ExpressionNode expression, List<String> type) {
        this.expression = expression;
        this.type = type;
    }

    @Override
    public String toString() {
        return expression + " as " + String.join(".", type);
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public List<String> getType() {
        return type;
    }
}