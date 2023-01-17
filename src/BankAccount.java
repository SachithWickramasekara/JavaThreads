import java.math.BigDecimal;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " has locked the shared account to deposit money");
        this.balance += amount;
        System.out.println(Thread.currentThread().getName() + " successfully updated the balance, current balance " + this.balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " has locked the shared account to withdraw money");
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " successfully updated the balance, current balance " + this.balance);
        } else {
            System.out.println("Insufficient balance! Transaction cannot be completed");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}
