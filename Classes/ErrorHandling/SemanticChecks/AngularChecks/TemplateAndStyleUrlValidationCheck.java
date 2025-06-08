package Classes.ErrorHandling.SemanticChecks.AngularChecks;

import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Tables.DecoratorSymbolTable;
import Classes.ErrorHandling.ErrorReporter;
import java.util.List;
import java.util.Map;

public class TemplateAndStyleUrlValidationCheck {
    private final DecoratorSymbolTable decoratorSymbolTable;

    public TemplateAndStyleUrlValidationCheck(DecoratorSymbolTable decoratorSymbolTable) {
        this.decoratorSymbolTable = decoratorSymbolTable;
    }

    public void check() {
        for (List<DecoratorRow> decoratorList : decoratorSymbolTable.getAllDecorators().values()) {
            for (DecoratorRow decorator : decoratorList) {
                if ("Component".equals(decorator.getName())) {
                    Map<String, Object> metadata = decorator.getMetadata();
                    if (metadata.containsKey("styles")) {
                        String styleUrl = (String) metadata.get("styles");
                        if (!isValidStyleUrl(styleUrl)) {
                            ErrorReporter.reportWithFile(
                                    decorator.getFileName(),
                                    "InvalidStyleUrlError",
                                    decorator.getLineNumber(),
                                    "Invalid style URL '" + styleUrl + "' in component '" +
                                            decorator.getClassName() + "'. Must be .css or .scss"
                            );
                        }
                    }
                    if (metadata.containsKey("templateUrl")) {
                        String templateUrl = (String) metadata.get("templateUrl");
                        if (!isValidTemplateUrl(templateUrl)) {
                            ErrorReporter.reportWithFile(
                                    decorator.getFileName(),
                                    "InvalidTemplateUrlError ",
                                    decorator.getLineNumber(),
                                    "Invalid template URL '" + templateUrl + "' in component '" +
                                            decorator.getClassName() + "'. Must be .html"
                            );
                        }
                    }


                }
            }
        }
    }

    private boolean isValidStyleUrl(String url) {

        return url.endsWith(".css") || url.endsWith(".scss");
    }
    private boolean isValidTemplateUrl(String url) {

        return url.endsWith(".html") ;
    }
}