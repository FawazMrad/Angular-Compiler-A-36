package Classes.HelperStructure;

import Classes.FileStructure.FileNode;

public class ParameterNode implements FileNode {
    private final String identifier;
    private final TypeNameNode typeName;

    public ParameterNode(String identifier, TypeNameNode typeName) {
        this.identifier = identifier;
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return identifier + ": " + typeName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public TypeNameNode getTypeName() {
        return typeName;
    }
}