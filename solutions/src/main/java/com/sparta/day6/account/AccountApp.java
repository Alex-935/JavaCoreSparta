package com.sparta.day6.account;

public class AccountApp {
    static void main() {
        BankAccount acc1 = new BankAccount("23", "Fred", 20.00);
        BankAccount acc2 = new BankAccount("24", "Freda", 50.00);

        acc1.deposit(30);
        acc1.displayInfo();

        acc2.withdrawal(60);
        acc2.displayInfo();
        acc2.withdrawal(50);
        acc2.displayInfo();

        acc1.applyInterest();
        acc1.displayInfo();
    }
}
