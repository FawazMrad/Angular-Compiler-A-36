package Classes.ASTNodeClasses.HelperStructure;

import Classes.ASTNodeClasses.FileStructure.FileNode;

public class TypeNameWrapperNode extends TypeNameNode implements FileNode {
    private final TypeNameNode wrappedTypeName;

    public TypeNameWrapperNode(TypeNameNode typeName) {
        super(typeName.getParts()); // Initialize parent with wrapped node's parts
        this.wrappedTypeName = typeName;
    }

    public TypeNameNode getWrappedTypeName() {
        return wrappedTypeName;
    }

    @Override
    public String toString() {
        return wrappedTypeName.toString();
    }
}