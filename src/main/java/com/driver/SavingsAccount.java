package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        super(name,balance,0);
        // minimum balance is 0 by default
        this.rate=rate;
        this.maxWithdrawalLimit=maxWithdrawalLimit;



    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount>maxWithdrawalLimit)
            throw new Exception("Maximum Withdraw Limit Exceed");
        if(this.getBalance()-amount<this.getMinBalance())
            throw new Exception("Insufficient Balance");
        this.setBalance(this.getBalance()-amount);

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        return this.getBalance()+this.getBalance()*this.rate*years/100;

    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double r=1+this.rate/(100*times);
        return this.getBalance()*Math.pow(r,times*years);

    }

}
