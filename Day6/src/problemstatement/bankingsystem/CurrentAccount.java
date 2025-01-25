package problemstatement.bankingsystem;

public class CurrentAccount extends BankAccount implements  Loanable {
    private static final double INTEREST_RATE = 0.1;
    private static final double LOAN_ELIGIBILTY = 100000;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    public void applyForLoan(double loanAmount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + loanAmount + " approved for account: " + getAccountNumber());
        } else {
            System.out.println("Loan not approved. Minimum balance requirement not met.");
        }
    }


    public boolean calculateLoanEligibility() {
        return getBalance() >= LOAN_ELIGIBILTY;
    }
}
