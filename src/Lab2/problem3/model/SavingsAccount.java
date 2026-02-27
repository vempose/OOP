package Lab2.problem3.model;

public class SavingsAccount extends Account {
    private double interestRate = 0.05; // %

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public SavingsAccount(double initialBalance, double initialInterestRate) {
        super(initialBalance);
        interestRate = initialInterestRate;
    }

    public void addInterest() {
        setBalance(getBalance() * interestRate);
    }
}
