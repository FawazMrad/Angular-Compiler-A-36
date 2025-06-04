package Classes.SymbolTable.Tables;

import Classes.SymbolTable.Rows.Row;
import Classes.SymbolTable.Rows.VariableRow;
import Classes.SymbolTable.SymbolTableInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class VariableSymbolTable implements SymbolTableInterface {
    private final Map<String, VariableRow> variables = new HashMap<>();
    private final Stack<String> scopeStack = new Stack<>();

    public VariableSymbolTable() {
        // Start with global scope
        scopeStack.push("global");
    }

    @Override
    public void addRow(Row row) {
        if (row instanceof VariableRow) {
            VariableRow varRow = (VariableRow) row;
            String compositeKey = getCurrentScope() + ":" + varRow.getName();
            variables.put(compositeKey, varRow);
        }
    }

    @Override
    public Row lookup(String name) {
        // Check current scope first
        String currentKey = getCurrentScope() + ":" + name;
        VariableRow result = variables.get(currentKey);

        // If not found, check parent scopes
        if (result == null) {
            for (int i = scopeStack.size() - 2; i >= 0; i--) {
                String parentKey = scopeStack.get(i) + ":" + name;
                result = variables.get(parentKey);
                if (result != null) break;
            }
        }
        return result;
    }

    public void enterScope(String scope) {
        scopeStack.push(scope);
    }

    public void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
        }
    }

    public String getCurrentScope() {
        return scopeStack.peek();
    }

    public Row lookup(String name, String scope) {
        return variables.get(createCompositeKey(name, scope));
    }

    private String createCompositeKey(VariableRow row) {
        return createCompositeKey(row.getName(), row.getScope());
    }

    private String createCompositeKey(String name, String scope) {
        return scope + ":" + name;
    }

    @Override
    public void print() {
        System.out.println("=== Variable Symbol Table ===");
        if (variables.isEmpty()) {
            System.out.println("  [No variables]");
            return;
        }

        // Print header
        System.out.printf("  %-15s %-15s %-10s %-15s %-15s %-6s%n",
                "Name", "Type", "Kind", "Value", "Scope", "Line");
        System.out.println("  -----------------------------------------------------------------");

        // Print data rows
        for (VariableRow row : variables.values()) {
            System.out.printf("  %-15s %-15s %-10s %-15s %-15s %-6d%n",
                    row.getName(),
                    row.getType(),
                    row.getKind(),
                    row.getValue() != null ? row.getValue() : "null",
                    row.getScope(),
                    row.getLineNumber());
        }
        System.out.println("===================================================================");
    }

    public void clear() {
        this.variables.clear();
    }

    // Helper method to get variables in a specific scope
    public Map<String, VariableRow> getVariablesInScope(String scope) {
        Map<String, VariableRow> scopeVariables = new HashMap<>();
        for (Map.Entry<String, VariableRow> entry : variables.entrySet()) {
            if (entry.getKey().startsWith(scope + ":")) {
                scopeVariables.put(entry.getValue().getName(), entry.getValue());
            }
        }
        return scopeVariables;
    }
}