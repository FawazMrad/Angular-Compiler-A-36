package Classes.HelperStructure;

import java.util.List;

public class TypeNameNode {
    private final List<String> parts;

    public TypeNameNode(List<String> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return String.join(".", parts);
    }

    public List<String> getParts() {
        return parts;
    }
}
