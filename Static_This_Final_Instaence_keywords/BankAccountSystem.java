class BankAccount {
  
    static String bankName = "State Bank Of India";
    static int totalAccounts = 0; 
    String accountHolderName;
    final int accountNumber; 

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
	
	// method to display total number account
    public static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }

    // method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
        } else {
            System.out.println("Not a valid BankAccount instance.");
        }
    }
}


public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount account1 = new BankAccount("Avinash Kumar Rai", 554211275);
        BankAccount account2 = new BankAccount("Anand Soni", 554211276);

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Displaying total accounts
        BankAccount.getTotalAccounts();

        
    }
}
