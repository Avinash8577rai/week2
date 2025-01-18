class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds.");
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + getBalance());
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12344555, "Avinash", 10000.0);
        sa.displayAccountDetails();
        sa.deposit(5000.0);
        sa.withdraw(3000.0);
        sa.displayAccountDetails();
    }
}

