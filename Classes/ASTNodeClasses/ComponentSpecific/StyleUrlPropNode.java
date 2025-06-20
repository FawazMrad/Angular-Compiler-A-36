package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.Expressions.LiteralExprNode;

public class StyleUrlPropNode extends ComponentPropertyNode {
    private final String styleUrl;

    public StyleUrlPropNode(String styleUrl) {
        super("styleUrl", new LiteralExprNode(styleUrl, "string"));
        this.styleUrl = styleUrl;
    }

    @Override
    public String getKey() {
        return "styleUrl";
    }

    @Override
    public ExpressionNode getValue() {
        return new LiteralExprNode(styleUrl, "string");
    }

    public String getStyleUrl() {
        return styleUrl;
    }
}