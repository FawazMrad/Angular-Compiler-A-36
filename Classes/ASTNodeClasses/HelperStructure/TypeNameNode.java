package Classes.ASTNodeClasses.HelperStructure;

import Classes.ASTNodeClasses.FileStructure.FileNode;

import java.io.File;
import java.util.List;

public class TypeNameNode implements FileNode {
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
