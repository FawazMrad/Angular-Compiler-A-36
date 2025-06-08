package Classes.ErrorHandling.SemanticChecks.TypeScriptChecks;

import Classes.SymbolTableClasses.Rows.VariableRow;
import Classes.SymbolTableClasses.Tables.VariableSymbolTable;
import Classes.ErrorHandling.ErrorReporter;

public class TypeMismatchCheck {
    private final VariableSymbolTable variableSymbolTable;

    public TypeMismatchCheck(VariableSymbolTable variableSymbolTable) {
        this.variableSymbolTable = variableSymbolTable;
    }

    public void check() {
        for (VariableRow variable : variableSymbolTable.getAllVariables()) {
            if (variable.getType() != null && variable.getValue() != null) {
                String declaredType = normalizeType(variable.getType());
                String initializerType = inferTypeFromValue(variable.getValue());

                if (!isTypeCompatible(declaredType, initializerType, variable.getName())) {
                    ErrorReporter.reportWithFile(
                            variableSymbolTable.getFileName(),
                            "TypeMismatchError",
                            variable.getLineNumber(),
                            String.format("Type '%s' is not assignable to type '%s' for variable '%s'",
                                    initializerType, declaredType, variable.getName())
                    );
                }
            }
        }
    }

    private boolean isTypeCompatible(String declaredType, String actualType, String varName) {
        // Handle Angular special cases
        if ("routes".equals(varName.toLowerCase()) && "any[]".equals(actualType)) {
            return true;
        }

        // Handle ApplicationConfig type
        if ("applicationconfig".equals(declaredType.toLowerCase()) && "object".equals(actualType)) {
            return true;
        }

        // Handle array cases
        if (isArrayType(declaredType) && isArrayType(actualType)) {
            return true;
        }

        // Handle empty array assignment
        if (isArrayType(declaredType) && "[]".equals(actualType)) {
            return true;
        }

        // Standard type compatibility
        if ("any".equals(declaredType) || "any".equals(actualType)) return true;
        if (declaredType.equalsIgnoreCase(actualType)) return true;

        return false;
    }

    private String normalizeType(String type) {
        if (type == null) return "any";
        type = type.toLowerCase();
        if (type.startsWith("route")) return "routes";
        if (type.equals("applicationconfig")) return "applicationconfig";
        return type;
    }
    private boolean isArrayType(String type) {
        return type != null && (type.endsWith("[]") || "routes".equalsIgnoreCase(type));
    }

    private String inferTypeFromValue(Object value) {

            if (value == null) return "any";
            if (value instanceof String) {
                String str = (String) value;
                if (str.startsWith("\"") || str.startsWith("'")) return "string";
                if ("true".equals(str) || "false".equals(str)) return "boolean";
                if (str.matches("-?\\d+(\\.\\d+)?")) return "number";
                if(str.startsWith("[")&&str.endsWith("]"))return "any[]";
                if (str.startsWith("[")) {
                    if (str.equals("[]")) return "emptyarray"; // Special case for empty arrays
                    // For arrays, try to infer element type
                    if (str.contains("\"") || str.contains("'")) return "string[]";
                    if (str.contains("{")) return "object[]";
                    return "any[]";
                }
                if (str.startsWith("{")) return "object";
            }
            return "any";
        }
}