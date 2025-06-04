package Classes.Expressions;

public class LiteralExprNode implements ExpressionNode {
    private final String value;
    private final String type;  // "number", "string", "boolean", etc.

    public LiteralExprNode(String value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return value ;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}