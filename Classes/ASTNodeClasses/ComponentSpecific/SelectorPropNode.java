package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.Expressions.LiteralExprNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;

public class SelectorPropNode extends ComponentPropertyNode implements FileNode {
    private final String selector;
    private final int line;
    public SelectorPropNode(String selector,int line) {
        super("selector", new LiteralExprNode(selector, "string"));
        this.selector = selector;
        this.line=line;
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
    public int getLine() {
        return line;
    }
    @Override
    public String toString() {
        return getKey() + ": " + selector;
    }

    public String getSelector() {
        return selector;
    }
}