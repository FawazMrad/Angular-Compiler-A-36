package Classes.ErrorHandling.SemanticChecks.TypeScriptChecks;

import Classes.SymbolTableClasses.Rows.VariableRow;
import Classes.SymbolTableClasses.Tables.VariableSymbolTable;
import Classes.ErrorHandling.ErrorReporter;

import java.util.*;

public class VariableRedeclarationAndConstReassignmentCheck {
    private final VariableSymbolTable variableSymbolTable;

    public VariableRedeclarationAndConstReassignmentCheck(VariableSymbolTable variableSymbolTable) {
        this.variableSymbolTable = variableSymbolTable;
    }

    // In VariableRedeclarationCheck.java
    public void check() {
        for (Map.Entry<String, Stack<VariableRow>> entry :
                variableSymbolTable.getAllVariableStacks().entrySet()) {

            Stack<VariableRow> stack = entry.getValue();
            // Only check within the same scope
            if (stack.size() > 1) {
                VariableRow firstDeclaration = stack.firstElement();

                for (int i = 1; i < stack.size(); i++) {

                    VariableRow redeclaration = stack.get(i);
                    if(Objects.equals(firstDeclaration.getKind(), "const") &&Objects.equals(redeclaration.getKind(), "let" ) ){
                        ErrorReporter.reportWithFile(
                                variableSymbolTable.getFileName(),
                                "ConstReassignmentError",
                                redeclaration.getLineNumber(),
                                "Const '" + redeclaration.getName() +
                                        "' is already declared in this scope at line " +
                                        firstDeclaration.getLineNumber() + "in scope : "+ firstDeclaration.getScope()
                        );
                    }

                    ErrorReporter.reportWithFile(
                            variableSymbolTable.getFileName(),
                            "VariableRedeclarationError",
                            redeclaration.getLineNumber(),
                            "Variable '" + redeclaration.getName() +
                                    "' is already declared in this scope at line " +
                                    firstDeclaration.getLineNumber() + "in scope : "+ firstDeclaration.getScope()
                    );
                }
            }
        }
    }}
