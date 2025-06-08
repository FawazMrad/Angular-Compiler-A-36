package Classes.ASTNodeClasses.HelperStructure;


public class PropertyAccessSegmentNode {
    private final boolean safe;
    private final String identifier;

    public PropertyAccessSegmentNode(boolean safe, String identifier) {
        this.safe = safe;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return (safe ? "?." : ".") + identifier;
    }

    public boolean isSafe() {
        return safe;
    }

    public String getIdentifier() {
        return identifier;
    }
}