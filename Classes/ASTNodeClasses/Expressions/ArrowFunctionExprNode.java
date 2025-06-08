package Classes.ASTNodeClasses.Expressions;

public class ArrowFunctionExprNode implements ExpressionNode {
    private final String parameter;
    private final ExpressionNode body;

    public ArrowFunctionExprNode(String parameter, ExpressionNode body) {
        this.parameter = parameter;
        this.body = body;
    }

    @Override
    public String toString() {
        return "(" + parameter + ") => " + body;
    }

    public String getParameter() {
        return parameter;
    }

    public ExpressionNode getBody() {
        return body;
    }
}