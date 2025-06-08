package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;
import Classes.ASTNodeClasses.HelperStructure.ObjectPropertyNode;

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