package Practice1;

import java.util.Scanner;

public class Problem4 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter parameters from quadratic equation");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.printf("The equation has no real roots: discriminant is negative: %.2f", discriminant);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (discriminant == 0) {
                System.out.printf("The equation has one repeated root: x = %.2f\n", x1);
            } else {
                System.out.printf("x1: %.2f\n", x1);
                System.out.printf("x2: %.2f\n", x2);
            }
        }

        input.close();
    }
}
