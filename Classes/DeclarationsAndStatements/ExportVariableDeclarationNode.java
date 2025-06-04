package Classes.DeclarationsAndStatements;

import Classes.FileStructure.FileNode;
import Classes.Statements.StatementNode;

public class ExportVariableDeclarationNode implements StatementNode  {
    private final VariableDeclarationNode variableDeclaration;

    public ExportVariableDeclarationNode(VariableDeclarationNode variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    @Override
    public String toString() {
        return "export " + variableDeclaration;
    }

    public VariableDeclarationNode getVariableDeclaration() {
        return variableDeclaration;
    }
}