package Classes.DeclarationsAndStatements;

import Classes.Expressions.ExpressionNode;
import Classes.Statements.StatementNode;

import java.util.List;

public class VariableDeclarationNode implements ClassMemberNode, StatementNode {
    private final boolean isConst;
    private final String identifier;
    private final List<String> typeName;
    private final ExpressionNode initializer;

    public VariableDeclarationNode(boolean isConst, String identifier,
                                   List<String> typeName, ExpressionNode initializer) {
        this.isConst = isConst;
        this.identifier = identifier;
        this.typeName = typeName;
        this.initializer = initializer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isConst) sb.append("const ");
        sb.append(identifier);

        if (typeName != null && !typeName.isEmpty()) {
            sb.append(": ").append(String.join(".", typeName));
        }

        if (initializer != null) {
            sb.append(" = ").append(initializer);
        }

        sb.append(";");
        return sb.toString();
    }

    public boolean isConst() {
        return isConst;
    }

    public String getIdentifier() {
        return identifier;
    }

    public List<String> getTypeName() {
        return typeName;
    }

    public ExpressionNode getInitializer() {
        return initializer;
    }
}