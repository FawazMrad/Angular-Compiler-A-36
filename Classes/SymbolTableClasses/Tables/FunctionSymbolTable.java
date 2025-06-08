package Classes.SymbolTableClasses.Tables;

import Classes.SymbolTableClasses.Rows.FunctionRow;
import Classes.SymbolTableClasses.Rows.Row;
import Classes.SymbolTableClasses.SymbolTableInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionSymbolTable implements SymbolTableInterface {
    private Map<String, FunctionRow> functions = new HashMap<>();
    private final String fileName;
    public FunctionSymbolTable(String fileName) {
        this.fileName = fileName;
        this.functions = new HashMap<>();
    }

    public String getFileName() {
        return fileName;
    }

    public Map<String, FunctionRow> getFunctions() {
        return functions;
    }

    public void addRow(Row row) {
        if (row instanceof FunctionRow) {
            functions.put(row.getName(), (FunctionRow) row);
        } else {
            throw new IllegalArgumentException("Only FunctionRow is allowed in FunctionSymbolTable");
        }
    }

    public FunctionRow lookup(String name) {
        return functions.get(name);
    }

    @Override
    public void print() {
        System.out.println("=== Function Symbol Table ===");
        if (functions.isEmpty()) {
            System.out.println("  [No functions]");
            return;
        }

        // Print header
        System.out.printf("  %-15s %-15s %-6s %-15s %-30s%n",
                "Name", "Return Type", "Line", "Scope", "Parameters");
        System.out.println("  -----------------------------------------------------------------");

        // Print data rows
        for (FunctionRow row : functions.values()) {
            String params = row.getParameters().stream()
                    .map(p -> p.getName() + ": " + p.getType())
                    .collect(Collectors.joining(", "));
            System.out.printf("  %-15s %-15s %-6d %-15s %-30s%n",
                    row.getName(),
                    row.getReturnType(),
                    row.getLineNumber(),
                    row.getScope(),
                    params);
        }
        System.out.println("===================================================================");
    }    public void clear() {
        this.functions.clear();
    }

}
