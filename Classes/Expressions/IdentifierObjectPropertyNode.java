package Classes.Expressions;

import Classes.HelperStructure.ObjectPropertyNode;
import Classes.Expressions.ExpressionNode;

public class IdentifierObjectPropertyNode extends ObjectPropertyNode {
    private final String identifier;
    private final ExpressionNode value;

    public IdentifierObjectPropertyNode(String identifier, ExpressionNode value) {
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
    @Override
    public String toString() {
        return identifier + ": " + value;
    }
}