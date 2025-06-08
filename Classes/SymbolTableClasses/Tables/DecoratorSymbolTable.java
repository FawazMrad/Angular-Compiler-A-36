package Classes.SymbolTableClasses.Tables;

import Classes.SymbolTableClasses.Rows.DecoratorRow;
import Classes.SymbolTableClasses.Rows.Row;
import Classes.SymbolTableClasses.SymbolTableInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecoratorSymbolTable implements SymbolTableInterface {

    private Map<String, List<DecoratorRow>> decorators = new HashMap<>();
    private final String fileName;

    public DecoratorSymbolTable(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void addRow(Row row) {
        if (row instanceof DecoratorRow) {
            DecoratorRow decoratorRow = (DecoratorRow) row;
            decorators.computeIfAbsent(decoratorRow.getName(), k -> new ArrayList<>()).add(decoratorRow);
        }
    }

    @Override
    public Row lookup(String name) {
        List<DecoratorRow> rows = decorators.get(name);
        return (rows != null && !rows.isEmpty()) ? rows.get(0) : null; // Returns the first match
    }

    @Override
    public void print() {
        System.out.println("=== Decorator Symbol Table ===");
        if (decorators.isEmpty()) {
            System.out.println("  [No decorators]");
            return;
        }

        // Print header
        System.out.printf("  %-15s %-6s %-15s %-30s%n",
                "Name", "Line", "Scope", "Metadata");
        System.out.println("  ------------------------------------------------------------");

        // Print data rows
        for (Map.Entry<String, List<DecoratorRow>> entry : decorators.entrySet()) {
            for (DecoratorRow row : entry.getValue()) {
                System.out.printf("  %-15s %-6d %-15s %-30s%n",
                        row.getName(),
                        row.getLineNumber(),
                        row.getScope(),
                        row.getMetadata().toString());
            }
        }
        System.out.println("===================================================================");
    }

    public void clear() {
        this.decorators.clear();
    }
    public Map<String, List<DecoratorRow>> getAllDecorators() {
        return decorators;
    }
}
