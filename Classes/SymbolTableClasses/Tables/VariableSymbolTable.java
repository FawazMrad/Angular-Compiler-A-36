package Classes.SymbolTableClasses.Tables;

import Classes.SymbolTableClasses.Rows.Row;
import Classes.SymbolTableClasses.Rows.VariableRow;
import Classes.SymbolTableClasses.SymbolTableInterface;

import java.util.*;
import java.util.stream.Collectors;

public class VariableSymbolTable implements SymbolTableInterface {
    private final Map<String, Stack<VariableRow>> variables = new HashMap<>();
    private final Stack<String> scopeStack = new Stack<>();
    private final String fileName;
    public VariableSymbolTable(String fileName) {
        this.fileName = fileName;
        scopeStack.push("global");
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void addRow(Row row) {
        if (row instanceof VariableRow) {
            VariableRow varRow = (VariableRow) row;
            String compositeKey = createCompositeKey(varRow);
            variables.computeIfAbsent(compositeKey, k -> new Stack<>()).push(varRow);
        }
    }


    @Override
    public Row lookup(String name) {
        // Search through all scopes from innermost to outermost
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            String scope = scopeStack.get(i);
            String key = scope + ":" + name;
            Stack<VariableRow> stack = variables.get(key);
            if (stack != null && !stack.isEmpty()) {
                return stack.peek();
            }
        }
        return null;
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
        String key = createCompositeKey(name, scope);
        Stack<VariableRow> stack = variables.get(key);
        return (stack != null && !stack.isEmpty()) ? stack.peek() : null;
    }

    private String createCompositeKey(VariableRow row) {
        return row.getScope() + ":" + row.getName();
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

        // Print data rows from all stacks
        for (Stack<VariableRow> stack : variables.values()) {
            for (VariableRow row : stack) {
                System.out.printf("  %-15s %-15s %-10s %-15s %-15s %-6d%n ",
                        row.getName(),
                        row.getType(),
                        row.getKind(),
                        row.getValue() != null ? row.getValue() : "null",
                        row.getScope(),
                        row.getLineNumber()
                );
            }
        }
        System.out.println("===================================================================");
    }

    public void clear() {
        this.variables.clear();
    }

    // Get all variable declarations across all scopes
    public List<VariableRow> getAllVariables() {
        return variables.values().stream()
                .flatMap(Stack::stream)
                .collect(Collectors.toList());
    }

    // Get all variable stacks (scope:name -> stack of declarations)
    public Map<String, Stack<VariableRow>> getAllVariableStacks() {
        return variables;
    }

    // Get top variables in a specific scope (most recent declarations)
    public Map<String, VariableRow> getVariablesInScope(String scope) {
        Map<String, VariableRow> scopeVariables = new HashMap<>();
        for (Map.Entry<String, Stack<VariableRow>> entry : variables.entrySet()) {
            if (entry.getKey().startsWith(scope + ":") && !entry.getValue().isEmpty()) {
                VariableRow topRow = entry.getValue().peek();
                scopeVariables.put(topRow.getName(), topRow);
            }
        }
        return scopeVariables;
    }

    // Get all declarations for a specific variable name
    public List<VariableRow> getVariableDeclarations(String name) {
        List<VariableRow> declarations = new ArrayList<>();
        for (Map.Entry<String, Stack<VariableRow>> entry : variables.entrySet()) {
            if (entry.getKey().endsWith(":" + name)) {
                declarations.addAll(entry.getValue());
            }
        }
        return declarations;
    }
}