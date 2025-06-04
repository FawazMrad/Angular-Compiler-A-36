package Classes.ComponentSpecific;

import Classes.Expressions.ExpressionNode;
import Classes.Expressions.LiteralExprNode;
import Classes.FileStructure.FileNode;

public class SelectorPropNode extends ComponentPropertyNode implements FileNode {
    private final String selector;

    public SelectorPropNode(String selector) {
        super("selector", new LiteralExprNode(selector, "string"));
        this.selector = selector;
    }

    @Override
    public String getKey() {
        return "selector";
    }

    @Override
    public ExpressionNode getValue() {
        // Wrap in a simple expression node for the string literal
        return new LiteralExprNode(selector, "string");
    }

    @Override
    public String toString() {
        return getKey() + ": " + selector;
    }

    public String getSelector() {
        return selector;
    }
}