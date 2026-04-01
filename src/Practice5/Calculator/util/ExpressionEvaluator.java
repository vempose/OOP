package Practice5.Calculator.util;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExpressionEvaluator {
    public static double evaluate(String expression)
            throws NoSuchElementException, NumberFormatException, UnsupportedOperationException {

        expression = expression.replaceAll("\\s+", "");

        for (char c : expression.toCharArray()) {
            if (!Character.isDigit(c) && "+-*/.".indexOf(c) == -1) {
                throw new UnsupportedOperationException("Unsupported operator: " + c);
            }
        }

        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

        // NoSuchElementException
        String firstOperand = tokenizer.nextToken();
        String operator = tokenizer.nextToken();
        String secondOperand = tokenizer.nextToken();

        // NumberFormatException
        double num1 = Double.parseDouble(firstOperand);
        double num2 = Double.parseDouble(secondOperand);

        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new UnsupportedOperationException("Unsupported operator: " + operator);
        };
    }
}