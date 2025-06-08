package Classes.ASTNodeClasses.DeclarationsAndStatements;

import Classes.ASTNodeClasses.Statements.StatementNode;

import java.util.List;

public class ImportDeclarationNode implements StatementNode {
    private final List<String> imports;
    private final String source;

    public ImportDeclarationNode(List<String> imports, String source) {
        this.imports = imports;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Import { " + String.join(", ", imports) + " } from '" + source + "'";
    }

    public List<String> getImports() {
        return imports;
    }

    public String getSource() {
        return source;
    }
}