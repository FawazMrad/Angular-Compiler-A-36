package Classes.SymbolTable.Rows;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionRow extends Row {
    private String returnType;
    private List<Parameter> parameters;

    public FunctionRow(String name, String returnType, List<Parameter> parameters, int lineNumber, String scope) {
        super(name, "function", null, lineNumber, scope);
        this.returnType = returnType;
        this.parameters = parameters != null ? parameters : new ArrayList<>();
    }

    public String getReturnType() {
        return returnType;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "FunctionRow { name='" + getName() + "', returnType='" + returnType +
                "', parameters=" + parameters.stream().map(Parameter::toString).collect(Collectors.joining(", ")) +
                ", scope='" + getScope() + "', lineNumber=" + getLineNumber() + " }";
    }

}
