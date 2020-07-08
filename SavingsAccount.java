
package bankaccount;

/**
 *
 * @author Ashad Nadeem
 */
public class SavingsAccount extends BankAccount {

    private double rate = 2.5 / 100;
    private int savingsNumber = 0;
    private String accountNumber;
    
    public SavingsAccount(String name, double ammount) {
        super(name, ammount);
        this.accountNumber = super.getAccountNumber() + "-" + 0;
        this.savingsNumber++;
    }

    public SavingsAccount(SavingsAccount oldAccount, double ammount) {
        super(oldAccount.getOwner(),ammount);
        this.accountNumber = oldAccount.accountNumber.substring(0,oldAccount.accountNumber.length()-1) + oldAccount.savingsNumber;
        this.savingsNumber = oldAccount.savingsNumber + 1 ;
    }

    public void postInterest() {
        double i = this.getBalance() * this.rate * (1 / 12);
        super.deposit(i);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
}
