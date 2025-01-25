package problemstatement.bankingsystem;

public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public  BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit amount must be positivr.");
        }
    }
    private void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance -= amount;
            System.out.println("withdrawn:" +amount+ "new balance"+balance);
        }else{
            System.out.println("infsucient balance ");
        }
    }
    public abstract double calculateInterest();

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName=holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

}
