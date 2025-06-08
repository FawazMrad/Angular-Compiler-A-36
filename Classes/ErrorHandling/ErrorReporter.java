package Classes.ErrorHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {
    private static final List<String> errors = new ArrayList<>();
    private static final String OUTPUT_FILE = "semantic_errors.txt";

    public static void report(String errorName, int line, String message) {
        String error = String.format("[%s] at line %d: %s", errorName, line, message);
        errors.add(error);
        System.err.println(error);
    }

    public static void reportWithFile(String fileName, String errorName, int line, String message) {
        String error = String.format("[%s] in %s:%d: %s", errorName, fileName, line, message);
        errors.add(error);
        System.err.println(error);
    }
    public static void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (String error : errors) {
                writer.write(error);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}