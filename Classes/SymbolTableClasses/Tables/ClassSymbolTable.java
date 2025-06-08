package Classes.SymbolTableClasses.Tables;

import Classes.SymbolTableClasses.Rows.Row;
import Classes.SymbolTableClasses.SymbolTableInterface;

import java.util.HashMap;
import java.util.Map;

public class ClassSymbolTable implements SymbolTableInterface {
    private Map<String, Row> classes = new HashMap<>();
    private final String fileName;
    public ClassSymbolTable(String fileName) {
        this.fileName = fileName;
        classes = new HashMap<>();

    }


    public Map<String, Row> getClasses() {
        return classes;
    }

  public String getFileName(){
        return fileName;
  }
    @Override
    public void addRow(Row row) {
        classes.put(row.getName(), row);
    }

    @Override
    public Row lookup(String name) {
        return classes.get(name);
    }

    @Override
    public void print() {
        System.out.println("=== Class Symbol Table ===");
        if (classes.isEmpty()) {
            System.out.println("  [No classes]");
            return;
        }

        // Print header
        System.out.printf("  %-15s %-15s 15s %-15s %-6s%n",
                "Name", "Type", "Scope", "Line");
        System.out.println("  ----------------------------------------------");

        // Print data rows
        for (Row row : classes.values()) {
            System.out.printf("  %-15s %-15s  %-15s %-6d%n",
                    row.getName(),
                    row.getType(),
                    row.getScope(),
                    row.getLineNumber());
        }
        System.out.println("===================================================================");
    }    public void clear() {
        this.classes.clear();
    }
}
