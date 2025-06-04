
package Classes.SymbolTable;

import Classes.SymbolTable.Rows.Row;

public interface SymbolTableInterface {
    void addRow(Row row);
    Row lookup(String name);
    void print();

    void clear();
}

