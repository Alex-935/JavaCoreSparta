package com.sparta.day1.breakeven;

public class BreakEvenApp {
    static void main() {
        double itemCostToProduce = 20.00;
        double itemSalePrice = 40.00;
        double fixedCosts = 50000.00;
        double profitPerItem = itemSalePrice - itemCostToProduce;

        System.out.printf("Sale price for each item: %.1f%n", itemSalePrice);
        System.out.printf("Fixed costs: %.1f%n", fixedCosts);
        System.out.printf("Profit per item: %.1f%n", profitPerItem);
        System.out.printf("Breakeven: %.0f", fixedCosts / profitPerItem);
    }
}
