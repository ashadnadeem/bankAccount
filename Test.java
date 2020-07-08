/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;


public class Test{
    public static void main(String[]args){
        //BankAccount Class
        BankAccount acc1 = new BankAccount("Ashad",1850.0);
        System.out.println(acc1.getOwner()+" "+acc1.getAccountNumber()+" "+acc1.getBalance());
        
        BankAccount acc2 = new BankAccount("Alina",100.0);
        System.out.println(acc2.getOwner()+" "+acc2.getAccountNumber()+" "+acc2.getBalance());
        
        //Checking Account
        CheckingAccount acc3 = new CheckingAccount("Admin",1234);
        System.out.println(acc3.getOwner()+" "+acc3.getAccountNumber()+" "+acc3.getBalance());
        
        //Savings Account
        SavingsAccount acc4 = new SavingsAccount("Savings1",1234);
        System.out.println(acc4.getOwner()+" "+acc4.getAccountNumber()+" "+acc4.getBalance());
        
        SavingsAccount acc5 = new SavingsAccount(acc4,1234);
        System.out.println(acc5.getOwner()+" "+acc5.getAccountNumber()+" "+acc5.getBalance());
        
        SavingsAccount acc6 = new SavingsAccount(acc5,1234);
        System.out.println(acc6.getOwner()+" "+acc6.getAccountNumber()+" "+acc6.getBalance());
        
        SavingsAccount acc7 = new SavingsAccount("Savings2",4321);
        System.out.println(acc7.getOwner()+" "+acc7.getAccountNumber()+" "+acc7.getBalance());
        
        SavingsAccount acc8 = new SavingsAccount(acc6,1234);
        System.out.println(acc8.getOwner()+" "+acc8.getAccountNumber()+" "+acc8.getBalance());
        
        
    }
    
}
