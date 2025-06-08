package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.Expressions.LiteralExprNode;

public class TemplatePropNode extends ComponentPropertyNode {
    private final String template;

    public TemplatePropNode(String template) {
        super("template", new LiteralExprNode(template, "string"));
        this.template = template;
    }

    @Override
    public String getKey() {
        return "template";
    }

    @Override
    public ExpressionNode getValue() {
        return new LiteralExprNode(template, "string");
    }

    @Override
    public String toString() {
        return getKey() + ": " + (template.length() > 20
                ? "\"" + template.substring(0, 17) + "...\""
                : "\"" + template + "\"");
    }

    public String getTemplate() {
        return template;
    }
}