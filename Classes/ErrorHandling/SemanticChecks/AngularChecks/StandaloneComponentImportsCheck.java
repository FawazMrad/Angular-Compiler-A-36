package Classes.ErrorHandling.SemanticChecks.AngularChecks;

import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Tables.DecoratorSymbolTable;
import Classes.ErrorHandling.ErrorReporter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StandaloneComponentImportsCheck {
    private final DecoratorSymbolTable decoratorSymbolTable;
    private static final Set<String> ANGULAR_MODULES_REQUIRING_IMPORTS = Set.of(
            "FormsModule",
            "ReactiveFormsModule",
            "RouterModule",
            "CommonModule"
    );

    public StandaloneComponentImportsCheck(DecoratorSymbolTable decoratorSymbolTable) {
        this.decoratorSymbolTable = decoratorSymbolTable;
    }

    public void check() {
        Map<String, List<DecoratorRow>> decorators = decoratorSymbolTable.getAllDecorators();
        for (List<DecoratorRow> decoratorList : decorators.values()) {
            for (DecoratorRow decorator : decoratorList) {
                if ("Component".equals(decorator.getName())) {
                    verifyStandaloneComponent(decorator);
                    checkRequiredImports(decorator);
                }
            }
        }
    }

    private void verifyStandaloneComponent(DecoratorRow decorator) {
        Map<String, Object> metadata = decorator.getMetadata();
        boolean isStandalone = (boolean) metadata.getOrDefault("standalone", false);

        if (isStandalone && (!metadata.containsKey("imports") || ((List<?>) metadata.get("imports")).isEmpty())) {
            ErrorReporter.reportWithFile(
                    decorator.getFileName(),
                    "MissingImportsError",
                    decorator.getLineNumber(),
                    "Standalone component '" + decorator.getClassName() + "' requires non-empty 'imports' array"
            );
        }
    }

    private void checkRequiredImports(DecoratorRow decorator) {
        Map<String, Object> metadata = decorator.getMetadata();
        String template = (String) metadata.getOrDefault("template", "");
        String templateUrl = (String) metadata.getOrDefault("templateUrl", "");
        String combinedTemplate = template + (templateUrl.isEmpty() ? "" : " [from templateUrl]");

        // Check for ngModel without FormsModule
        if ((combinedTemplate.contains("[(ngModel)]") || combinedTemplate.contains("ngModel"))) {
            if (!hasImport(decorator, "FormsModule")) {
                ErrorReporter.reportWithFile(
                        decorator.getFileName(),
                        "MissingModuleError",
                        decorator.getLineNumber(),
                        "Component '" + decorator.getClassName() + "' uses ngModel but doesn't import FormsModule"
                );
            }
        }

        // Check for reactive forms directives without ReactiveFormsModule
        if (combinedTemplate.contains("formGroup") || combinedTemplate.contains("formControl") ||
                combinedTemplate.contains("formArray") || combinedTemplate.contains("formControlName")) {
            if (!hasImport(decorator, "ReactiveFormsModule")) {
                ErrorReporter.reportWithFile(
                        decorator.getFileName(),
                        "MissingModuleError",
                        decorator.getLineNumber(),
                        "Component '" + decorator.getClassName() + "' uses reactive forms directives but doesn't import ReactiveFormsModule"
                );
            }
        }

        // Check for router directives without RouterModule
        if (combinedTemplate.contains("routerLink") || combinedTemplate.contains("router-outlet") ||
                combinedTemplate.contains("routerLinkActive") || combinedTemplate.contains("routerLinkWithHref")) {
            if (!hasImport(decorator, "RouterModule")) {
                ErrorReporter.reportWithFile(
                        decorator.getFileName(),
                        "MissingModuleError",
                        decorator.getLineNumber(),
                        "Component '" + decorator.getClassName() + "' uses router directives but doesn't import RouterModule"
                );
            }
        }

        // Check for common directives without CommonModule
        if (combinedTemplate.contains("*ngIf") || combinedTemplate.contains("*ngFor") ||
                combinedTemplate.contains("*ngSwitch") || combinedTemplate.contains("ngClass") ||
                combinedTemplate.contains("ngStyle")) {
            if (!hasImport(decorator, "CommonModule")) {
                ErrorReporter.reportWithFile(
                        decorator.getFileName(),
                        "MissingModuleError",
                        decorator.getLineNumber(),
                        "Component '" + decorator.getClassName() + "' uses common directives but doesn't import CommonModule"
                );
            }
        }

        // Check for HttpClient directives without HttpClientModule
        if (combinedTemplate.contains("http") || combinedTemplate.contains("HttpClient")) {
            if (!hasImport(decorator, "HttpClientModule")) {
                ErrorReporter.reportWithFile(
                        decorator.getFileName(),
                        "MissingModuleError",
                        decorator.getLineNumber(),
                        "Component '" + decorator.getClassName() + "' uses HttpClient but doesn't import HttpClientModule"
                );
            }
        }

        // Check for animations without BrowserAnimationsModule
        if (combinedTemplate.contains("@trigger") || combinedTemplate.contains("[@") ||
                combinedTemplate.contains("*ngIf") || combinedTemplate.contains("*ngFor") ||
                combinedTemplate.contains("*ngSwitch")) {
            if (!hasImport(decorator, "BrowserAnimationsModule") && !hasImport(decorator, "NoopAnimationsModule")) {
                ErrorReporter.reportWithFile(
                        decorator.getFileName(),
                        "MissingModuleError",
                        decorator.getLineNumber(),
                        "Component '" + decorator.getClassName() + "' uses animations but doesn't import BrowserAnimationsModule or NoopAnimationsModule"
                );
            }
        }
    }

    private boolean hasImport(DecoratorRow decorator, String moduleName) {
        if (!decorator.getMetadata().containsKey("imports")) {
            return false;
        }
        List<?> imports = (List<?>) decorator.getMetadata().get("imports");
        return imports.stream().anyMatch(imp -> imp.toString().contains(moduleName));
    }
}