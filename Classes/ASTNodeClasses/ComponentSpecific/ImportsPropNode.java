package Classes.ASTNodeClasses.ComponentSpecific;

import Classes.ASTNodeClasses.Expressions.ArrayLiteralExprNode;
import Classes.ASTNodeClasses.Expressions.ExpressionNode;
import Classes.ASTNodeClasses.Expressions.LiteralExprNode;
import Classes.ASTNodeClasses.FileStructure.FileNode;
import Classes.ASTNodeClasses.HelperStructure.ImportListNode;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//public class ImportsPropNode extends ComponentPropertyNode implements FileNode {
//    private final ImportListNode imports;
//    public ImportsPropNode(ImportListNode imports) {
//        super("imports", convertToArrayLiteral(imports));
//        this.imports = imports;
//    }
//
//    private static ArrayLiteralExprNode convertToArrayLiteral(ImportListNode imports) {
//        return new ArrayLiteralExprNode(
//                imports.getImports().stream()
//                        .map(imp -> new LiteralExprNode(imp, "string"))
//                        .collect(Collectors.toList())
//
//        );
//    }
//
//
//    public ImportListNode getImports() {
//        return imports;
//    }
//
//    @Override
//    public String getKey() {
//        return "";
//    }
//
//    @Override
//    public ExpressionNode getValue() {
//        return null;
//    }
//}

public class ImportsPropNode extends ComponentPropertyNode implements FileNode {
    private final ImportListNode imports;

    public ImportsPropNode(ImportListNode imports) {
        super("imports", convertToArrayLiteral(imports));
        this.imports = imports != null ? imports : new ImportListNode(Collections.emptyList());
    }

    private static ArrayLiteralExprNode convertToArrayLiteral(ImportListNode imports) {
        // Handle null case and empty imports
        List<String> importStrings = (imports == null || imports.getImports() == null)
                ? Collections.emptyList()
                : imports.getImports();

        // Convert to array literal expression
        List<ExpressionNode> elements = importStrings.stream()
                .filter(Objects::nonNull)  // Filter out any null imports
                .map(imp -> new LiteralExprNode(imp, "string"))
                .collect(Collectors.toList());

        return new ArrayLiteralExprNode(elements);
    }

    @Override
    public String getKey() {
        return "imports";
    }

    @Override
    public ExpressionNode getValue() {
        return convertToArrayLiteral(imports);
    }

    public ImportListNode getImports() {
        return imports;
    }
}