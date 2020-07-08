/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Ashad Nadeem
 */
public class CheckingAccount extends BankAccount {

    private static double FEE = 15;

    public CheckingAccount(String name, double ammount) {
        super(name, ammount);
        super.setAccountNumber(this.getAccountNumber() + "-10");
    }

    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE);
    }
}
