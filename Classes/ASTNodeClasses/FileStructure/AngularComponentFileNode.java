package Classes.ASTNodeClasses.FileStructure;

import Classes.ASTNodeClasses.DeclarationsAndStatements.ClassDeclarationNode;
import Classes.ASTNodeClasses.DeclarationsAndStatements.DecoratedClassNode;
import Classes.ASTNodeClasses.DeclarationsAndStatements.ImportDeclarationNode;

import java.util.List;
import java.util.Collections;

public class AngularComponentFileNode implements FileNode {
    private final List<ImportDeclarationNode> imports;
    private final List<ClassDeclarationNode> preDecoratorClasses;
    private final List<DecoratedClassNode> decoratedClasses;
    private final List<ClassDeclarationNode> postDecoratorClasses;

    public AngularComponentFileNode(List<ImportDeclarationNode> imports,
                                    List<ClassDeclarationNode> preDecoratorClasses,
                                    List<DecoratedClassNode> decoratedClasses,
                                    List<ClassDeclarationNode> postDecoratorClasses) {
        this.imports = imports != null ? imports : Collections.emptyList();
        this.preDecoratorClasses = preDecoratorClasses != null ? preDecoratorClasses : Collections.emptyList();
        this.decoratedClasses = decoratedClasses != null ? decoratedClasses : Collections.emptyList();
        this.postDecoratorClasses = postDecoratorClasses != null ? postDecoratorClasses : Collections.emptyList();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AngularComponentFile:\n");

        // Imports
        if (!imports.isEmpty()) {
            sb.append("  Imports:\n");
            imports.forEach(imp -> sb.append("    ").append(imp).append("\n"));
        }

        // Pre-decorator classes
        if (!preDecoratorClasses.isEmpty()) {
            sb.append("  Pre-decorator Classes:\n");
            preDecoratorClasses.forEach(cls ->
                    sb.append("    ").append(cls).append("\n"));
        }

        // Decorated classes
        if (!decoratedClasses.isEmpty()) {
            sb.append("  Decorated Classes:\n");
            decoratedClasses.forEach(dcn -> {
                boolean isMain = isMainComponent(dcn.getClassNode());
                sb.append("    ")
                        .append(isMain ? "[MAIN] " : "")
                        .append(dcn.getDecorator()).append("\n    ")
                        .append(dcn.getClassNode())
                        .append("\n");
            });
        }

        // Post-decorator classes (nullable)
        if (!postDecoratorClasses.isEmpty()) {
            sb.append("  Post-decorator Classes:\n");
            postDecoratorClasses.forEach(cls ->
                    sb.append("    ").append(cls).append("\n"));
        }

        return sb.toString();
    }

    private boolean isMainComponent(ClassDeclarationNode cls) {
        return decoratedClasses.stream()
                .anyMatch(dcn -> dcn.getClassNode().equals(cls) &&
                        dcn.getDecorator().getDecoratorName().equals("Component"));
    }

    // Getters
    public List<ImportDeclarationNode> getImports() { return Collections.unmodifiableList(imports); }
    public List<ClassDeclarationNode> getPreDecoratorClasses() { return Collections.unmodifiableList(preDecoratorClasses); }
    public List<DecoratedClassNode> getDecoratedClasses() { return Collections.unmodifiableList(decoratedClasses); }
    public List<ClassDeclarationNode> getPostDecoratorClasses() { return Collections.unmodifiableList(postDecoratorClasses); }
    public ClassDeclarationNode getMainComponentClass() {
        return decoratedClasses.stream()
                .filter(dcn -> dcn.getDecorator().getDecoratorName().equals("Component"))
                .map(DecoratedClassNode::getClassNode)
                .findFirst()
                .orElse(null);
    }
}