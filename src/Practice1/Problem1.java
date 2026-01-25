package Practice1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type in your name: ");
        String name = in.nextLine();

        int width = name.length();

        String border = "+" + "-".repeat(width) + "+";

        System.out.println(border);
        System.out.println("|" + name + "|");
        System.out.println(border);

        in.close();
    }
}
