package Classes.ASTNodeClasses.DeclarationsAndStatements;

import Classes.ASTNodeClasses.Statements.StatementNode;

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