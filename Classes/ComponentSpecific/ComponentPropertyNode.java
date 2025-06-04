package Classes.ComponentSpecific;

import Classes.Expressions.ExpressionNode;
import Classes.FileStructure.FileNode;
import Classes.HelperStructure.ObjectPropertyNode;

public abstract class ComponentPropertyNode extends ObjectPropertyNode implements FileNode {
    public abstract String getKey();
    public abstract ExpressionNode getValue();
    public ComponentPropertyNode(String key, ExpressionNode value) {
        super(key, value);
    }
    @Override
    public String toString() {
        return getKey() + ": " + getValue();
    }

}