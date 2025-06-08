package Classes.SymbolTableClasses.Rows;

public class VariableRow extends Row {
    private final String kind; // "const" or "let"
    private final String varType; // The variable's type annotation
    private final boolean isExported;

    public VariableRow(String name, String kind, String varType,
                       Object initialValue, int lineNumber,
                       String scope, boolean isExported) {
        super(name, varType, initialValue, lineNumber, scope);
        this.kind = kind;
        this.varType = varType;
        this.isExported = isExported;
    }

    public String getKind() {
        return kind;
    }

    public String getVarType() {
        return varType;
    }

    public boolean isExported() {
        return isExported;
    }

    @Override
    public String toString() {
        return "VariableRow { " +
                "name='" + getName() + '\'' +
                ", kind='" + kind + '\'' +
                ", type='" + varType + '\'' +
                ", value=" + getValue() +
                ", exported=" + isExported +
                ", scope='" + getScope() + '\'' +
                ", line=" + getLineNumber() +
                " }";
    }

}