package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.Expressions.LiteralExprNode;

public class TemplateUrlPropNode extends ComponentPropertyNode {
    private final String templateUrl;

    public TemplateUrlPropNode(String templateUrl) {
        super("templateUrl", new LiteralExprNode(templateUrl, "string"));
        this.templateUrl = templateUrl;
    }

    @Override
    public String getKey() {
        return "templateUrl";
    }

    @Override
    public ExpressionNode getValue() {
        return new LiteralExprNode(templateUrl, "string");
    }

    public String getTemplateUrl() {
        return templateUrl;
    }
}