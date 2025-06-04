package Classes.DeclarationsAndStatements;

import Classes.FileStructure.FileNode;
import Classes.HelperStructure.BlockNode;
import Classes.HelperStructure.ParameterNode;

import java.util.List;

public class MethodDeclarationNode implements ClassMemberNode , FileNode {
    private final String methodName;
    private final List<ParameterNode> parameters;
    private final BlockNode body;

    public MethodDeclarationNode(String methodName,
                                 List<ParameterNode> parameters,
                                 BlockNode body) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(methodName)
                .append("(");

        if (parameters != null) {
            for (int i = 0; i < parameters.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(parameters.get(i));
            }
        }

        sb.append(") ")
                .append(body.toString().replace("\n", "\n  "));

        return sb.toString();
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public BlockNode getBody() {
        return body;
    }
}