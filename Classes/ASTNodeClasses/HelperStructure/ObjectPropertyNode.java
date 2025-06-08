package Classes.ASTNodeClasses.HelperStructure;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;

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