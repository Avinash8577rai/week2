package problemstatement.bankingsystem;
import java.util.ArrayList;
        import java.util.List;
public class BankingSystem {
    public static void main(String[] args) {

            List<BankAccount>accounts=new ArrayList<>();

            accounts.add(new SavingsAccount("755785451", "Avinash", 5000));
            accounts.add(new CurrentAccount("755785455", "Ankit", 10000));

            for(BankAccount account:accounts){
                System.out.println("Account Number;"+ account.getAccountNumber());
                System.out.println("Holder Name:"+account.getHolderName());
                System.out.println("Balance:"+account.getBalance());

                double interest =account.calculateInterest();
                System.out.println("Calculates interest:"+interest);

                if(account instanceof Loanable){
                    Loanable loanableAccount=(Loanable)account;
                    loanableAccount.applyForLoan(500);
                }
            }

    }
}
