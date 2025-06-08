package Classes.ASTNodeClasses.Expressions;
import Classes.ASTNodeClasses.HelperStructure.ObjectPropertyNode;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectLiteralExprNode implements ExpressionNode {
    private final List<ObjectPropertyNode> properties;

    public ObjectLiteralExprNode(List<ObjectPropertyNode> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return properties.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ", "{", "}"));
    }

    public List<ObjectPropertyNode> getProperties() {
        return properties;
    }
}