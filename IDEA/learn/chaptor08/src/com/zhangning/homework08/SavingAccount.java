package com.zhangning.homework08;

public class SavingAccount extends BankAccount {
    private int discount = 3;
    public double interest_rate = 0.03;

    public SavingAccount(int balance) {
        super(balance);

    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void deposit(double amount) {
        if (discount <= 0){
            super.deposit(amount - 1);
        } else {
            super.deposit(amount);
            discount--;
        }

    }

    public void withdraw(double amount) {
        if (discount <= 0){
           super.withdraw(amount + 1);
        } else {
            super.withdraw(amount);
            discount--;
        }
    }

    public void earnMonthlyInterest() {
        super.deposit(getBalance() * interest_rate);
        discount = 3;
    }
}
