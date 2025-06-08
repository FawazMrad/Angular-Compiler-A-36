package Classes.ASTNodeClasses.Expressions;

import Classes.ASTNodeClasses.HelperStructure.PropertyAccessSegmentNode;

import java.util.List;

public class PropertyAccessExprNode implements ExpressionNode {
    private final String base;
    private final List<PropertyAccessSegmentNode> segments;

    public PropertyAccessExprNode(String base, List<PropertyAccessSegmentNode> segments) {
        this.base = base;
        this.segments = segments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(base);
        for (PropertyAccessSegmentNode segment : segments) {
            sb.append(segment);
        }
        return sb.toString();
    }

    public String getBase() {
        return base;
    }

    public List<PropertyAccessSegmentNode> getSegments() {
        return segments;
    }
}