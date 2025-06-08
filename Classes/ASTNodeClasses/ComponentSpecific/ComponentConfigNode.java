package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.FileStructure.FileNode;

import java.util.List;

public class ComponentConfigNode  implements FileNode{
    private final List<ComponentPropertyNode> properties;

    public ComponentConfigNode(List<ComponentPropertyNode> properties) {
        super();
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (properties != null && !properties.isEmpty()) {
            for (int i = 0; i < properties.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(properties.get(i));
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public List<ComponentPropertyNode> getProperties() {
        return properties;
    }
}