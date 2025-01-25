class BankAccount{
String accountNumber;
double balance;

	BankAccount(String accountNumber, double balance){
	this.accountNumber=accountNumber;
	this.balance=balance;
	}
	void displayinfo(){
	System.out.println(" Bank account number is " + accountNumber);
	System.out.println(" Bank balance is " + balance);
	}
		public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}
class SavingAccount extends BankAccount{
double interestRate;
		SavingAccount(String accountNumber, double balance, double interestRate){
		super(accountNumber, balance);
		this.interestRate=interestRate;
		}
		
		void displayinfo(){
		System.out.println(" Bank interest on saving account is " + interestRate);
		super.displayinfo();
		}
		public void displayAccountType() {
        System.out.println("Account type: Saving Account");
    }
}
class CheckingAccount extends BankAccount{
int withdrawalLimit;
		CheckingAccount(String accountNumber, double balance, int withdrawalLimit){
		super(accountNumber, balance);
		this.withdrawalLimit=withdrawalLimit;
		}
		
		void displayinfo(){
		System.out.println(" Bank interest on saving account is " + withdrawalLimit);
		super.displayinfo();
		}
		public void displayAccountType() {
        System.out.println("Account type: Checking Bank Account");
    }
}
class FixedDepositAccount extends BankAccount{
int years;
		FixedDepositAccount(String accountNumber, double balance,int years){
		super(accountNumber, balance);
		this.years=years;
		}
		
		void displayinfo(){
		System.out.println("Number of year for fixid deposit " + years);
		super.displayinfo();
		}
		public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
       
		SavingAccount savings = new SavingAccount("7551257485", 5000.00, 3.5);
        CheckingAccount checking = new CheckingAccount("7551257485", 2000.00, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("7551257485", 10000.00, 5);

        
        System.out.println("Savings Account Details:");
        savings.displayAccountType();
        savings.displayinfo();

        System.out.println("Checking Account Details:");
        checking.displayAccountType();
        checking.displayinfo();

        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayinfo();
    }
}