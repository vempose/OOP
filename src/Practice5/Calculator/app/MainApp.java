package Practice5.Calculator.app;

import Practice5.Calculator.util.ExpressionEvaluator;

import java.io.*;
import java.util.NoSuchElementException;

public class MainApp {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("expressions.txt"));
                PrintWriter resultsWriter = new PrintWriter(new FileWriter("results.txt"));
                PrintWriter errorWriter = new PrintWriter(new FileWriter("errors.txt"))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isBlank()) continue;

                try {
                    double result = ExpressionEvaluator.evaluate(line);
                    resultsWriter.println(line.trim() + " = " + result);

                } catch (NoSuchElementException e) {
                    errorWriter.println("Expression: " + line);
                    errorWriter.println("Error: Missing operand or operator.");
                    errorWriter.println();

                } catch (NumberFormatException e) {
                    errorWriter.println("Expression: " + line);
                    errorWriter.println("Error: Invalid operand format.");
                    errorWriter.println();
                }
            }

            System.out.println("All work is done. Check the files.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}