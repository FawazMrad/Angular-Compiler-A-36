package Classes.ASTNodeClasses.DeclarationsAndStatements;

import Classes.ASTNodeClasses.FileStructure.FileNode;

import java.util.List;

public class ImportDeclarationsNode implements FileNode {
    private final List<ImportDeclarationNode> imports;

    public ImportDeclarationsNode(List<ImportDeclarationNode> imports) {
        this.imports = imports;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Imports:\n");
        for (ImportDeclarationNode imp : imports) {
            sb.append("  ").append(imp.toString()).append("\n");
        }
        return sb.toString();
    }

    public List<ImportDeclarationNode> getImports() {
        return imports;
    }
}