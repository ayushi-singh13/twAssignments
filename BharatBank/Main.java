package com.thoughtworksPrograd;
class BharatBank {
    private int balance;
    private final String accountType;

    BharatBank(int balance, String accountType){
        this.balance=balance;
        this.accountType=accountType.toLowerCase();
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withdraw(int amt){
        if(balance-amt>=0)
        this.balance-=amt;
        else{
            System.out.println("Inefficient balance");
        }
    }
    public double getQuarterlyInterest(){
        if (this.accountType.equals("current"))
            return 0;

        else{
            double savingRate = 3;
            return (this.balance* savingRate *0.25)/100.0;
        }
    }


}
public class Main {

    public static void main(String[] args) {
	// write your code here
        BharatBank gopal = new BharatBank(50000, "current");
        BharatBank amrita = new BharatBank(100000, "savings");


        gopal.deposit(10000);
        System.out.println("Gopal's Balance: " + gopal.getQuarterlyInterest());
        gopal.withdraw(70000);


        amrita.withdraw(45000);
        System.out.println("Amrita's Balance: " + amrita.getQuarterlyInterest());

    }
}
