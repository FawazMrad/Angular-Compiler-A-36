package Classes.ErrorHandling.SemanticChecks.AngularChecks;

import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Tables.DecoratorSymbolTable;
import Classes.ErrorHandling.ErrorReporter;
import java.util.List;
import java.util.Map;

public class TemplateMutualExclusionCheck {
    private final DecoratorSymbolTable decoratorSymbolTable;

    public TemplateMutualExclusionCheck(DecoratorSymbolTable decoratorSymbolTable) {
        this.decoratorSymbolTable = decoratorSymbolTable;
    }

    public void check() {
        for (List<DecoratorRow> decoratorList : decoratorSymbolTable.getAllDecorators().values()) {
            for (DecoratorRow decorator : decoratorList) {
                if ("Component".equals(decorator.getName())) {
                    Map<String, Object> metadata = decorator.getMetadata();
                    if (metadata.containsKey("template") && metadata.containsKey("templateUrl")) {
                        ErrorReporter.reportWithFile(
                                decorator.getFileName(),
                                "TemplateConflictError",
                                decorator.getLineNumber(),
                                "Component '" + decorator.getClassName() + "' cannot have both 'template' and 'templateUrl'"
                        );
                    }
                }
            }
        }
    }
}