package Classes.ErrorHandling.SemanticChecks.AngularChecks;

import Classes.ASTNodeClasses.ComponentSpecific.SelectorPropNode;
import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Tables.DecoratorSymbolTable;
import Classes.ErrorHandling.ErrorReporter;

import java.util.List;
import java.util.Map;

public class ComponentSelectorCheck {
    private final DecoratorSymbolTable decoratorSymbolTable;

    public ComponentSelectorCheck(DecoratorSymbolTable decoratorSymbolTable) {
        this.decoratorSymbolTable = decoratorSymbolTable;
    }

    public void check() {
        Map<String, List<DecoratorRow>> decoratorsMap = decoratorSymbolTable.getAllDecorators();
        for (Map.Entry<String, List<DecoratorRow>> entry : decoratorsMap.entrySet()) {
            for (DecoratorRow decorator : entry.getValue()) {
                if ("Component".equals(decorator.getName())) {
                    Object selectorObj = decorator.getMetadata().get("selector");

                    if (selectorObj instanceof SelectorPropNode) {
                        SelectorPropNode selector = (SelectorPropNode) selectorObj;
                        validateSelector(selector, decorator.getClassName());
                    }
                    else if (selectorObj instanceof String) {
                        // Create a temporary SelectorPropNode or modify validateSelector to accept String
                        SelectorPropNode selector = new SelectorPropNode((String) selectorObj, decorator.getLineNumber());
                        validateSelector(selector, decorator.getClassName());
                    }
                    else if (selectorObj != null) {
                        ErrorReporter.reportWithFile(
                                decoratorSymbolTable.getFileName(),
                                "InvalidSelectorError",
                                decorator.getLineNumber(),
                                "Component selector must be a string, found: " + selectorObj.getClass().getSimpleName()
                        );
                    }
                }
            }
        }
    }

    private void validateSelector(SelectorPropNode selector, String className) {
        String selectorValue = selector.getSelector();
        int line = selector.getLine();
        // Rule 1: Must contain a hyphen
        if (!selectorValue.contains("-")) {
            ErrorReporter.report(
                    "InvalidSelectorError",
                    line,
                    "Component selector '" + selectorValue + "' must contain a hyphen (-)"
            );
        }

        // Rule 2: Must start with app prefix
        if (!selectorValue.startsWith("app-")) {
            ErrorReporter.report(
                    "InvalidSelectorError",
                    line,
                    "Component selector '" + selectorValue + "' should start with 'app-' prefix"
            );
        }

        // Rule 3: Must be kebab-case
        if (!selectorValue.matches("[a-z]+(-[a-z0-9]+)*")) {
            ErrorReporter.report(
                    "InvalidSelectorError",
                    line,
                    "Component selector '" + selectorValue + "' must be in kebab-case (lowercase with hyphens)"
            );
        }

        // Rule 4: Cannot be a native HTML element
        if (isNativeHtmlElement(selectorValue)) {
            ErrorReporter.report(
                    "InvalidSelectorError",
                    line,
                    "Component selector '" + selectorValue + "' conflicts with native HTML element"
            );
        }
    }

    private boolean isNativeHtmlElement(String selector) {
        // Common HTML elements to check against
        String[] htmlElements = {
                "div", "span", "button", "input", "form", "table", "img",
                "a", "p", "h1", "h2", "h3", "ul", "li", "header", "footer"
        };

        for (String element : htmlElements) {
            if (element.equalsIgnoreCase(selector)) {
                return true;
            }
        }
        return false;
    }
}