package com.sparta.day6.animal.account;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate = 0.025;

    // un-parameterised constructor
    BankAccount() {}

    BankAccount(String accountHolder, String accountNumber, double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("The amount to deposit must be greater than zero.");
        }
    }

    public void withdraw(double amount) {

        if (amount < this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient funds for that transaction.");
        }
    }

    public void applyInterest() {
        this.balance *= this.interestRate;
    }

    public void displayInfo() {
        System.out.printf("""
                ======================
                Account Number : %s
                Account Holder : %s
                Account Balance: %.2f
                ======================%n
                """, this.accountNumber, this.accountHolder, this.balance);
    }
}
