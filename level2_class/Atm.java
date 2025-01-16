//create a BankAccount class
class BankAccount{
    String accountHolder;
	String accountNumber;
	double balance;
	
	//constructor to intialize the attributes
	BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
	
     //method to deposit the money in my account
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
	
	 //method to withdraw the money from my account
	public void withdraw(double amount) {
        if (amount > 0) {
           if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    // method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
	
	// method the display the abnk deatils
    public void displayAccountDetails(){
        System.out.println("BankAccount Holdername : " + accountHolder);
		System.out.println("BankAccount Number : " + accountNumber);
	    
	}

}

 public class Atm{  
  // main method 
	public static void main(String[] args){

        // Create a BankAccount object
        BankAccount account = new BankAccount("Avinash kumar rai", "1234567890", 10000.00);

        // Display account details
        account.displayAccountDetails();

        // Display initial balance
        account.displayBalance();

        // Deposit money
        account.deposit(5000.00);
        account.displayBalance();

        // Withdraw money
        account.withdraw(2000.00);
        account.displayBalance();

        // Try to withdraw more than the available balance
        account.withdraw(20000.00);
        account.displayBalance();

	}
}