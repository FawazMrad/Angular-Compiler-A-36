package Classes.ASTNodeClasses.Statements;

import Classes.ASTNodeClasses.DeclarationsAndStatements.VariableDeclarationNode;

public class VariableDeclStmtNode implements StatementNode {
    private final VariableDeclarationNode declaration;

    public VariableDeclStmtNode(VariableDeclarationNode declaration) {
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return declaration.toString();
    }

    public VariableDeclarationNode getDeclaration() {
        return declaration;
    }
}