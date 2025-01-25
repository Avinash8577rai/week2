package problemstatement.bankingsystem;

public interface Loanable {
    void applyForLoan(double loanAmount);
    boolean calculateLoanEligibility();
}
