package Practice1;

import java.util.Scanner;

public class Problem2 {
    public static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side length (a) of the square: ");
        double a = in.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println("\n- Results -");
        System.out.printf("Area:        %.2f\n", area);
        System.out.printf("Perimeter:   %.2f\n", perimeter);
        System.out.printf("Diagonal:    %.2f\n", diagonal);

        in.close();
    }
}
