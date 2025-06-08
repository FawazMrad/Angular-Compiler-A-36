package Classes.ASTNodeClasses.Statements;

import Classes.ASTNodeClasses.Expressions.FunctionCallExprNode;

public class FunctionCallStmtNode implements StatementNode {
    private final FunctionCallExprNode functionCall;
    private final boolean hasSemicolon;

    public FunctionCallStmtNode(FunctionCallExprNode functionCall, boolean hasSemicolon) {
        this.functionCall = functionCall;
        this.hasSemicolon = hasSemicolon;
    }

    @Override
    public String toString() {
        return functionCall.toString() + (hasSemicolon ? ";" : "");
    }


    public FunctionCallExprNode getFunctionCall() {
        return functionCall;
    }

    public boolean hasSemicolon() {
        return hasSemicolon;
    }
}