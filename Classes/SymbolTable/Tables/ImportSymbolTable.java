package Classes.SymbolTable.Tables;

import Classes.SymbolTable.Rows.ImportRow;
import Classes.SymbolTable.Rows.Row;
import Classes.SymbolTable.SymbolTableInterface;

import java.util.*;

public class ImportSymbolTable implements SymbolTableInterface {

    private Map<String, ImportRow> imports = new HashMap<>();

    @Override
    public void addRow(Row row) {
        if (row instanceof ImportRow) {
            imports.put(row.getName(), (ImportRow) row);
        }
    }

    @Override
    public Row lookup(String name) {
        return imports.get(name);
    }

    @Override
    public void print() {
        System.out.println("=== Import Symbol Table ===");
        if (imports.isEmpty()) {
            System.out.println("  [No imports]");
            return;
        }

        // Print header (without scope)
        System.out.printf("  %-15s %-30s %-6s%n",
                "Name", "Source", "Line");
        System.out.println("  ---------------------------------------");

        // Print data rows (without scope)
        for (ImportRow row : imports.values()) {
            System.out.printf("  %-15s %-30s %-6d%n",
                    row.getName(),
                    row.getSource(),
                    row.getLineNumber());
        }
        System.out.println("===================================================================");
    }    public void clear() {
        this.imports.clear(); // Clears the underlying HashMap
    }
}