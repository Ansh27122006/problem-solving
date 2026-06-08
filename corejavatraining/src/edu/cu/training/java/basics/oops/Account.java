package edu.cu.training.java.basics.oops;

public class Account {
    private double balance;

    Account(){
        this.balance=0;
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Doesn't have sufficient balance");
        }
        balance-=amount;
        System.out.println("Remaining balance: "+balance);
    };
    void deposit(double amount){
        balance+=amount;
        System.out.println("Balance is:"+balance);
    }
}
