package com.thoughtworksPrograd;
abstract class BharatBank {
    protected double accountBalance;
    protected final String accountType;

    BharatBank(int accountBalance, String accountType){
        this.accountBalance = accountBalance;
        this.accountType = accountType.toLowerCase();
    }

    public void deposit(int depositedAmount) {
        this.accountBalance += depositedAmount;
    }

    public double checkBalance(){
       return  accountBalance;
    }

    public abstract void withdraw(int withdrawalAmount);

    public abstract double getQuarterlyInterest();

}
class CurrentAccount extends BharatBank{

    CurrentAccount(int accountBalance, String accountType) {
        super(accountBalance, accountType);
    }

    @Override
    public void withdraw(int withdrawalAmount) {
        if(withdrawalAmount > (1.2 * accountBalance))
            System.out.println("Insufficient Balance ");
        else
            accountBalance -= withdrawalAmount;
    }

    @Override
    public double getQuarterlyInterest() {
        return 0;
    }
}
class SavingsAccount extends BharatBank{

    SavingsAccount(int accountBalance, String accountType) {
        super(accountBalance, accountType);
    }

    @Override
    public void withdraw(int withdrawalAmount) {
        if(withdrawalAmount > accountBalance)
            System.out.println("Insufficient Balance ");
        else
            accountBalance -= withdrawalAmount;
    }

    @Override
    public double getQuarterlyInterest() {
        double savingsRate = 3.0;
        double interestDuration = 0.25;
        return (accountBalance * savingsRate * interestDuration) / 100;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        BharatBank gopalCurrentAccount = new CurrentAccount(50000, "current");
        BharatBank amritaSavingAccount = new SavingsAccount(100000, "savings");


        gopalCurrentAccount.deposit(10000);

        System.out.println("Gopal's interest: " + gopalCurrentAccount.getQuarterlyInterest());

        gopalCurrentAccount.withdraw(70000);
        System.out.println("Gopal's balance: " + gopalCurrentAccount.checkBalance());



        amritaSavingAccount.withdraw(45000);

        System.out.println("Amrita's interest: " + amritaSavingAccount.getQuarterlyInterest());


    }
}
