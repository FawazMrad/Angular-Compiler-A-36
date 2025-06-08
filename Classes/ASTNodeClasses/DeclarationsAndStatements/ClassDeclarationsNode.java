package Classes.ASTNodeClasses.DeclarationsAndStatements;

import Classes.ASTNodeClasses.Statements.StatementNode;

import java.util.List;

public class ClassDeclarationsNode implements StatementNode {
    private final List<ClassDeclarationNode> declarations;

    public ClassDeclarationsNode(List<ClassDeclarationNode> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ClassDeclarationNode decl : declarations) {
            sb.append(decl).append("\n");
        }
        return sb.toString();
    }

    public List<ClassDeclarationNode> getDeclarations() {
        return declarations;
    }
}