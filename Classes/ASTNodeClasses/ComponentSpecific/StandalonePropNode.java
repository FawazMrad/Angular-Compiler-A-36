package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.Expressions.LiteralExprNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;

public class StandalonePropNode extends ComponentPropertyNode implements FileNode {
    private final boolean standalone;

    public StandalonePropNode(boolean standalone) {
        super("standalone", new LiteralExprNode(String.valueOf(standalone), "boolean"));
        this.standalone = standalone;
    }

    @Override
    public String getKey() {
        return "standalone";
    }

    @Override
    public ExpressionNode getValue() {
        return new LiteralExprNode(String.valueOf(standalone), "boolean");
    }

    public boolean isStandalone() {
        return standalone;
    }
}