package com.sparta.day6.account;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0.0) return;
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount > balance) return;
        balance -= amount;
    }

    public void displayInfo() {
        System.out.printf("Account: %s | Account Holder: %s | Balance %.2f%n", accountNumber, accountHolder, balance);
    }

    public void applyInterest() {
        balance *= 1.025;
    }
}
