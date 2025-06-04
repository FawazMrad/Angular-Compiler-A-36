package Classes.DeclarationsAndStatements;

import Classes.DeclarationsAndStatements.ClassDeclarationNode;
import Classes.DeclarationsAndStatements.DecoratorDeclarationNode;
import Classes.FileStructure.FileNode;

public class DecoratedClassNode implements ClassMemberNode {
    private final DecoratorDeclarationNode decorator;
    private final ClassDeclarationNode classNode;

    public DecoratedClassNode(DecoratorDeclarationNode decorator,
                              ClassDeclarationNode classNode) {
        this.decorator = decorator;
        this.classNode = classNode;
    }

    @Override
    public String toString() {
        return decorator.toString() + "\n" + classNode.toString();
    }

    // Getters
    public DecoratorDeclarationNode getDecorator() { return decorator; }
    public ClassDeclarationNode getClassNode() { return classNode; }
}