package com.sparta.day2.livingcost;

import java.util.Scanner;

public class LivingCostApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float rent, gas, electricity, water, councilTax;

        System.out.print("Rent per month: ");
        rent = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Gas per month: ");
        gas = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Electricity per month: ");
        electricity = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Water per month: ");
        water = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Council tax per month: ");
        councilTax = scanner.nextFloat();
        scanner.nextLine();

        float total = rent + gas + electricity + water + councilTax;

        System.out.printf("""
                Your monthly expenses are:
                Rent:          $   %7.2f
                Gas:           $   %7.2f
                Electricity:   $   %7.2f
                Water:         $   %7.2f
                Council Tax:   $   %7.2f
                ==========================
                Total:         $   %7.2f
                ==========================
                """, rent, gas, electricity, water, councilTax, total);
    }
}
