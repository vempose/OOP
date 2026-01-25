package Practice1;

public class Problem5 {
    static void main() {
        double initialBalance = 1000.00;    // starting money
        double interestRate = 0.05;         // 5% interest rate

        double interestEarned = initialBalance * interestRate;

        double newBalance = initialBalance + interestEarned;

        System.out.printf("\nInitial Balance:  $%.2f\n", initialBalance);
        System.out.printf("Interest Rate:    %.2f%%\n", (interestRate * 100));
        System.out.println("---------------------------------");
        System.out.printf("Interest Earned:  $%.2f\n", interestEarned);
        System.out.printf("New Balance:      $%.2f\n", newBalance);
    }
}
