package Classes.ASTNodeClasses.Statements;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;

public class AssignmentStmtNode implements StatementNode {
    private final ExpressionNode target;
    private final ExpressionNode value;

    public AssignmentStmtNode(ExpressionNode target, ExpressionNode value) {
        this.target = target;
        this.value = value;
    }

    @Override
    public String toString() {
        return target + " = " + value + ";";
    }

    public ExpressionNode getTarget() {
        return target;
    }

    public ExpressionNode getValue() {
        return value;
    }
}