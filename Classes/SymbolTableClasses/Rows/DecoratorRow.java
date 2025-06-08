package Classes.SymbolTableClasses.Rows;


import java.util.Map;

public class DecoratorRow extends Row {
    private Map<String, Object> metadata; // e.g., { "selector": "app-root", "templateUrl": "./app.component.html" }
    private String className;
    private String fileName;

    public DecoratorRow(String name, Map<String, Object> metadata, int lineNumber, String scope,String className,String fileName) {
        super(name, "decorator", null, lineNumber, scope);
        this.metadata = metadata;
        this.className=className;
        this.fileName=fileName;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        return "DecoratorRow { name='" + getName() + "', metadata=" + metadata + " }";
    }
    public void addMetadata(String key, String value) {
        this.metadata.put(key, value);
    }
    public String getClassName(){
        return className;
    }
    public String getFileName() {
        return fileName;
    }

}