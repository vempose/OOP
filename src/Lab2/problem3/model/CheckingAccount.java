package Lab2.problem3.model;

public class CheckingAccount extends Account {
    private final int FREE_TRANSACTIONS = 10;
    private int numberOfTransactions = 0;
    private final double FEE = 0.02; // dollars

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deductFee() {
        withdraw(FEE);
    }

    public void deductFee(double amount) {
        withdraw(amount);
    }

    private void proceedOperation() {
        numberOfTransactions++;
        if (numberOfTransactions > FREE_TRANSACTIONS) {
            deductFee(FEE);
        }
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        proceedOperation();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        proceedOperation();
    }

    @Override
    public void transferTo(Account other, double amount) {
        super.transferTo(other, amount);
        proceedOperation();
    }

    @Override
    public void transferFrom(Account other, double amount) {
        super.transferFrom(other, amount);
        proceedOperation();
    }
}
