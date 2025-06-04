package Classes.Expressions;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayLiteralExprNode implements ExpressionNode {
    private final List<ExpressionNode> elements;

    public ArrayLiteralExprNode(List<ExpressionNode> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return elements.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ", "[", "]"));
    }
    public List<ExpressionNode> getElements() {
        return elements;
    }
}