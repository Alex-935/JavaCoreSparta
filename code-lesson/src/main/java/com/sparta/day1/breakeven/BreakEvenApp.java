package com.sparta.day1.breakeven;

public class BreakEvenApp {

    static void main() {

        float productionCosts = 20;
        float salePrice = 40;
        float fixedCosts = 50000;
        float breakeven = (float) Math.ceil(fixedCosts / (salePrice - productionCosts));

        //int breakevens = (breakeven > (int) breakeven) ? (int) breakeven + 1 : (int) breakeven ;

        System.out.printf(
                """
                        Sale price for each item: %.2f
                        Fixed costs: %.2f
                        Profit per item: %.2f
                        Breakeven: %d
                """, salePrice, fixedCosts, productionCosts, (int) breakeven
        );
    }
}
