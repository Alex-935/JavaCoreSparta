package com.sparta.day2.livingcost;

import java.util.Scanner;

public class LivingCostApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double livingCost = 0;
        double rent = getInput("Rent per month: ", scanner);
        double gas = getInput("Gas payment per month: ", scanner);
        double electricity = getInput("Electricity payment per month: ", scanner);
        double water = getInput("Water payment per month: ", scanner);
        double councilTax = getInput("Council tax payment per month: ", scanner);

        System.out.printf("""
                                  Your monthly expenses are:
                                  Rent:             £%7.2f
                                  Gas:              £%7.2f
                                  Electricity:      £%7.2f
                                  Water:            £%7.2f
                                  Council Tax:      £%7.2f
                                  =========================
                                  Total:            £%7.2f
                                  =========================
                                  """,
                          rent, gas, electricity, water, councilTax,
                          rent + gas + electricity + water + councilTax);
    }

    private static double getInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
