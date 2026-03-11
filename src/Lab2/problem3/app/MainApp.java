package Lab2.problem3.app;

import Lab2.problem3.model.Account;
import Lab2.problem3.model.Bank;
import Lab2.problem3.model.CheckingAccount;
import Lab2.problem3.model.SavingsAccount;

public class MainApp {
    static void main() {
        Account account = new Account(200);
        CheckingAccount checkingAccount = new CheckingAccount(100);
        SavingsAccount savingsAccount = new SavingsAccount(250);

        Bank bank = new Bank();
        bank.addAccount(account);
        bank.addAccount(checkingAccount);
        bank.addAccount(savingsAccount);

//        savingsAccount.close(); // throws runtime error

        bank.update();

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}
