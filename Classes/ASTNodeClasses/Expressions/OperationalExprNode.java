package Classes.ASTNodeClasses.Expressions;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;

public class OperationalExprNode implements ExpressionNode {
    private final ExpressionNode left;
    private final String operator;
    private final ExpressionNode right;

    public OperationalExprNode(ExpressionNode left, String operator, ExpressionNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    // Getters
    public ExpressionNode getLeft() { return left; }
    public String getOperator() { return operator; }
    public ExpressionNode getRight() { return right; }

    @Override
    public String toString() {
        return left + " " + operator + " " + right;
    }
}