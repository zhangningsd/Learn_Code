package com.zhangning.homework08;

public class HomeWork08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(500);
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyInterest();
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
    }
}
