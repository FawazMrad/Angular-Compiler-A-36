package Classes.SymbolTable.Rows;

public class Row {
    private String name;
    private String type;
    private Object value;
    private int lineNumber;
    private String scope;

    public Row(String name ,  String type , Object value , int lineNumber , String scope) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.lineNumber = lineNumber;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "Row { name='" + name + "', type='" + type + "', value=" + value +
                ", scope='" + scope + "', lineNumber=" + lineNumber + "}";
    }
}


