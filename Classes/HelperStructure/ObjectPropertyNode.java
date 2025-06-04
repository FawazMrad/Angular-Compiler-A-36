package Classes.HelperStructure;

import Classes.Expressions.ExpressionNode;
import Classes.FileStructure.FileNode;

public class ObjectPropertyNode implements FileNode {
    private final String key;
    private final ExpressionNode value;

    public ObjectPropertyNode(String key, ExpressionNode value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public ExpressionNode getValue() {
        return value;
    }
}