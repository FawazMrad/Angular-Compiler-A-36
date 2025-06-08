package Classes.ASTNodeClasses.Expressions;

public class IdentifierExprNode implements ExpressionNode {
    private final String identifier;
    private final boolean isPropertyAccess;

    public IdentifierExprNode(String identifier) {
        this(identifier, false);
    }

    public IdentifierExprNode(String identifier, boolean isPropertyAccess) {
        this.identifier = identifier;
        this.isPropertyAccess = isPropertyAccess;
    }

    @Override
    public String toString() {
        return identifier + (isPropertyAccess ? " (property)" : "");
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public boolean isPropertyAccess() {
        return isPropertyAccess;
    }
}