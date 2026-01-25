package Practice1;

import java.util.Scanner;

public class Problem3 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your total score (0-100): ");
        double score = in.nextDouble();

        String grade;

        if (score >= 95 && score <= 100) {
            grade = "A";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 75) {
            grade = "B-";
        } else if (score >= 70) {
            grade = "C+";
        } else if (score >= 65) {
            grade = "C";
        } else if (score >= 60) {
            grade = "C-";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50) {
            grade = "D";
        } else if (score >= 0 && score < 50) {
            grade = "F";
        } else {
            grade = "Invalid Score: Must be between 0-100)";
        }

        System.out.println("Your grade is: " + grade);

        in.close();
    }
}
