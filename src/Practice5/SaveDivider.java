package Practice5;

import java.util.Scanner;

public class SaveDivider {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int x1;
        int x2;

        while (true) {
            try {
                System.out.print("Input your first integer: ");
                x1 = Integer.parseInt(scan.nextLine());
                System.out.print("Input your second integer: ");
                x2 = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(redify("Wrong input: you were supposed to enter an integer."));
                continue;
            }

            try {
                System.out.println("Your result of integer division: " + (x1 / x2));
            } catch (ArithmeticException e) {
                System.err.println(redify("Division by zero is not allowed here, boy."));
            }
        }
    }

    public static String redify(String str) {
        return "\u001B[31m" + str + "\u001B[0m";
    }
}
