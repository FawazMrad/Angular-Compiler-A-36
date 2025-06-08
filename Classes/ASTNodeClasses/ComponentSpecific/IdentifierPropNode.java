package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.HelperStructure.ObjectPropertyNode;

public class IdentifierPropNode extends ObjectPropertyNode {
    private final String identifier;
    private final ExpressionNode value;

    public IdentifierPropNode(String identifier, ExpressionNode value) {
       super(identifier,value);
        this.identifier = identifier;
        this.value = value;
    }

    @Override
    public String getKey() {
        return identifier;
    }

    @Override
    public ExpressionNode getValue() {
        return value;
    }
}