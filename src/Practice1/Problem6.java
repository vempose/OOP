package Practice1;

import java.util.Scanner;

public class Problem6 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String word = in.nextLine();

        System.out.println(isPalindrome(word) ? "It's a palindrome." : "It's not a palindrome.");

        in.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
