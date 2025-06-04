package Classes.ComponentSpecific;

import Classes.Expressions.ExpressionNode;
import Classes.Expressions.LiteralExprNode;
import Classes.FileStructure.FileNode;

public class StringPropNode extends ComponentPropertyNode implements FileNode {
    private final String key;
    private final ExpressionNode value;  // Changed to ExpressionNode

    public StringPropNode(String key, ExpressionNode value) {
     super(key,value);
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public ExpressionNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\"" + key + "\": " + value;
    }
}