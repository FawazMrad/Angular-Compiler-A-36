package Classes.ComponentSpecific;

import Classes.Expressions.ExpressionNode;
import Classes.Expressions.LiteralExprNode;
import Classes.FileStructure.FileNode;

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