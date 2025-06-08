package Classes.ErrorHandling.SemanticChecks.AngularChecks;


import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Tables.DecoratorSymbolTable;
import Classes.ErrorHandling.ErrorReporter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateSelectorCheck {
    private  DecoratorSymbolTable decoratorSymbolTable;
    private final Map<String, DecoratorRow> selectorRegistry = new HashMap<>();

    public DuplicateSelectorCheck(DecoratorSymbolTable decoratorSymbolTable) {
        this.decoratorSymbolTable = decoratorSymbolTable;
    }

    public void check() {
        for (List<DecoratorRow> decoratorList : decoratorSymbolTable.getAllDecorators().values()) {
            for (DecoratorRow decorator : decoratorList) {
                if ("Component".equals(decorator.getName())) {
                    verifySelectorUnique(decorator);
                }
            }
        }
    }

    private void verifySelectorUnique(DecoratorRow decorator) {
        String selector = (String) decorator.getMetadata().get("selector");
        if (selector == null) return;

        if (selectorRegistry.containsKey(selector)) {
            DecoratorRow firstDefinition = selectorRegistry.get(selector);
            reportDuplicate(
                    decorator,
                    selector,
                    firstDefinition.getLineNumber()
            );
        } else {
            selectorRegistry.put(selector, decorator);
        }
    }

    private void reportDuplicate(DecoratorRow duplicate, String selector, int firstLine) {
        ErrorReporter.reportWithFile(
                duplicate.getFileName(),
                "DuplicateSelectorError",
                duplicate.getLineNumber(),
                String.format("Selector '%s' duplicates selector in %s at line %d",
                        selector,
                        duplicate.getClassName(),
                        firstLine
                )
        );
    }

}