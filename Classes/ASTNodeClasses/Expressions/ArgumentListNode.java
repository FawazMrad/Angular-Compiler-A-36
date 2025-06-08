package Classes.ASTNodeClasses.Expressions;

import Classes.ASTNodeClasses.FileStructure.FileNode;

import java.util.List;
import java.util.stream.Collectors;

public class ArgumentListNode implements FileNode {
    private final List<ExpressionNode> arguments;

    public ArgumentListNode(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return String.join(", ", arguments.stream()
                .map(Object::toString)
                .collect(Collectors.toList()));
    }
}