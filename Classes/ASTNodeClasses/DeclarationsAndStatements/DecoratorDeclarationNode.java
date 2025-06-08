package Classes.ASTNodeClasses.DeclarationsAndStatements;//package Classes.ASTNodeClasses.DeclarationsAndStatements;

import Classes.ASTNodeClasses.ComponentSpecific.ComponentConfigNode;

public class DecoratorDeclarationNode implements ClassMemberNode {
    private final String name;
    private final ComponentConfigNode config;

    public DecoratorDeclarationNode(String name, ComponentConfigNode config) {
        this.name = name;
        this.config = config;
    }

    public String getDecoratorName() {
        return name;
    }

    public ComponentConfigNode getConfig() {
        return config;
    }


        @Override
    public String toString() {

                return "@" + name + "(" + config + ")" ;

        }

}
