package Classes.ASTNodeClasses.Statements;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;

public class AwaitStmtNode implements StatementNode {
    private final ExpressionNode expression;
    private final boolean hasSemicolon;

    public AwaitStmtNode(ExpressionNode expression, boolean hasSemicolon) {
        this.expression = expression;
        this.hasSemicolon = hasSemicolon;
    }

    @Override
    public String toString() {
        return "await " + expression + (hasSemicolon ? ";" : "");
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public boolean hasSemicolon() {
        return hasSemicolon;
    }
}