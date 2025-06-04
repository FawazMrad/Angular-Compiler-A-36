package Classes.HelperStructure;

import Classes.FileStructure.FileNode;

import java.util.List;

public class ImportListNode implements FileNode {
    private final List<String> imports;

    public ImportListNode (List<String> imports) {
        this.imports = imports;
    }

    public List<String> getImports() {

        return imports;
    }

    @Override
    public String toString() {
        return String.join("imports "+", ", imports);
    }
}