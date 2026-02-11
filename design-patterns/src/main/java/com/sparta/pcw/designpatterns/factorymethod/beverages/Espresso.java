package com.sparta.pcw.designpatterns.factorymethod.beverages;

public class Espresso extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Press the Espresso button...chug chug chug gurgle.");
    }

    @Override
    public void serve() {
        System.out.println("Pass the tiny cup of Espresso to the customer.");
    }

    @Override
    public String getName() {
        return "Espresso";
    }
}
