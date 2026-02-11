package com.sparta.pcw.designpatterns.factorymethod.beverages;

public class FlatWhite extends Beverage {

    @Override
    public void prepare() {
        System.out.println("Press the Flat White button.... sloooooooosh");
    }

    @Override
    public void serve() {
        System.out.println("Here is your flat white");
    }

    @Override
    public String getName() {
        return "Flat White";
    }
}
