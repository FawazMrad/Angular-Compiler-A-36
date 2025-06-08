package Classes.ASTNodeClasses.HelperStructure;

import Classes.ASTNodeClasses.FileStructure.FileNode;

import java.util.List;
import java.util.stream.Collectors;

public class ParameterListNode implements FileNode {
    private final List<ParameterNode> parameters;

    public ParameterListNode(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return String.join(", ", parameters.stream()
                .map(ParameterNode::toString)
                .collect(Collectors.toList()));
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }
}