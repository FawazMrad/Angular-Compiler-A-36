package Classes.DeclarationsAndStatements;

import Classes.FileStructure.FileNode;

import java.util.List;
import java.util.Objects;

public class ClassDeclarationNode implements ClassMemberNode {
    private final boolean isExported;
    private final String className;
    private final String baseClass;
    private final List<ClassMemberNode> members;

    public ClassDeclarationNode(boolean isExported, String className,
                                String baseClass, List<ClassMemberNode> members) {
        this.isExported = isExported;
        this.className = className;
        this.baseClass = baseClass;
        this.members = members;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isExported) sb.append("export ");
        sb.append("class ").append(className);
        if (baseClass != null) sb.append(" extends ").append(baseClass);
        sb.append(" {\n");

        for (ClassMemberNode member : members) {
            sb.append("  ").append(member.toString().replace("\n", "\n  ")).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
    // In ClassDeclarationNode.java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDeclarationNode that = (ClassDeclarationNode) o;
        return isExported == that.isExported &&
                Objects.equals(className, that.className) &&
                Objects.equals(baseClass, that.baseClass) &&
                Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isExported, className, baseClass, members);
    }
    public boolean isExported() {
        return isExported;
    }

    public String getClassName() {
        return className;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public List<ClassMemberNode> getMembers() {
        return members;
    }
    public void addMembers(List<ClassMemberNode> members) {
        this.members.addAll(members);
    }
}