package Lab2.problem3.model;

public abstract class Account {
    private double balance; // The current balance
    private final int id; // The account number
    private static int nextId = 1;

    public Account() {
        balance = 0.0;
        id = nextId;
        nextId++;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
        id = nextId;
        nextId++;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (balance - sum < 0) {
            throw new RuntimeException("The balance cannot be negative!");
        }

        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountId() {
        return id;
    }

    public void transferTo(Account other, double amount) {
        withdraw(amount);
        other.deposit(amount);
    }

    public void transferFrom(Account other, double amount) {
        other.withdraw(amount);
        deposit(amount);
    }

    @Override
    public String toString() {
        return String.format("Account id: %d\nBalance: %.2f\n", getAccountId(), getBalance());
    }

    public final void print() {
        System.out.println(this);
    }
}
