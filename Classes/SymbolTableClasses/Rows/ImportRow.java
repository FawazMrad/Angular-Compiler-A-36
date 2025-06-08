package Classes.SymbolTableClasses.Rows;

public class ImportRow extends Row {
    private String source; // e.g., "@angular/core"

    public ImportRow(String name, String source, int lineNumber, String scope) {
        super(name, "import", null, lineNumber, scope);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "ImportRow { name='" + getName() + "', source='" + source + "' }";
    }
}