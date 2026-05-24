// ENCAPSULATION EXAMPLE
// Demonstrates hiding internal state and providing controlled access

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;
    private static final double MINIMUM_BALANCE = 1000.0;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance >= MINIMUM_BALANCE ? initialBalance : MINIMUM_BALANCE;
    }

    // Encapsulated access to balance with validation
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
            return true;
        }
        System.out.println("Invalid deposit amount");
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            return true;
        }
        System.out.println("Insufficient funds or invalid amount");
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
