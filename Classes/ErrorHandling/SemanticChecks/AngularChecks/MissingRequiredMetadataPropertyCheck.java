package Classes.ErrorHandling.SemanticChecks.AngularChecks;


import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Tables.DecoratorSymbolTable;
import Classes.ErrorHandling.ErrorReporter;

import java.util.List;
import java.util.Map;

public class MissingRequiredMetadataPropertyCheck {
    private final DecoratorSymbolTable decoratorSymbolTable;

    public MissingRequiredMetadataPropertyCheck(DecoratorSymbolTable decoratorSymbolTable) {
        this.decoratorSymbolTable = decoratorSymbolTable;
    }

    public void check() {
        // Get all component decorators
        Map<String, List<DecoratorRow>> allDecorators = decoratorSymbolTable.getAllDecorators();

        for (List<DecoratorRow> decoratorList : allDecorators.values()) {
            for (DecoratorRow decorator : decoratorList) {
                if ("Component".equals(decorator.getName())) {
                    verifyComponentDecorator(decorator);
                }
            }
        }
    }

    private void verifyComponentDecorator(DecoratorRow decorator) {
        Map<String, Object> metadata = decorator.getMetadata();
        String className = decorator.getClassName();
        int line = decorator.getLineNumber();

        // Check for selector
        if (!metadata.containsKey("selector")) {
            ErrorReporter.reportWithFile(
                    decorator.getFileName(),
                    "MissingSelectorError",
                    line,
                    "Component '" + className + "' is missing required 'selector' property"
            );
        }

        // Check for template or templateUrl
        if (!metadata.containsKey("template") && !metadata.containsKey("templateUrl")) {
            ErrorReporter.reportWithFile(
                    decorator.getFileName(),
                    "MissingTemplateError",
                    line,
                    "Component '" + className + "' must have either 'template' or 'templateUrl'"
            );
        }
    }
}