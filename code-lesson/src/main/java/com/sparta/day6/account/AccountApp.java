package com.sparta.day6.account;

public class AccountApp {

    public static void main(String[] args) {

        BankAccount eddieAccount = new BankAccount("Edward Richtofen", "115", 35623.48);
        BankAccount dempsyAccout = new BankAccount("Tank Dempsey", "935", 152.37);
        BankAccount nikolaiAccount = new BankAccount("Nikolai Belinsky", "041", -124.72);

        eddieAccount.withdraw(127.40);
        dempsyAccout.deposit(53.26);
        dempsyAccout.withdraw(25);
        nikolaiAccount.withdraw(12.50);
        nikolaiAccount.withdraw(12.50);
        nikolaiAccount.withdraw(12.50);
        nikolaiAccount.withdraw(12.50);
        dempsyAccout.withdraw(12.50);

        eddieAccount.displayInfo();
        dempsyAccout.displayInfo();
        nikolaiAccount.displayInfo();
    }
}
