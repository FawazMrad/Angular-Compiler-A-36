
package Classes.SymbolTableClasses;

import Classes.SymbolTableClasses.Rows.Row;

public interface SymbolTableInterface {
    void addRow(Row row);
    Row lookup(String name);
    void print();

    void clear();
    String getFileName();
}

