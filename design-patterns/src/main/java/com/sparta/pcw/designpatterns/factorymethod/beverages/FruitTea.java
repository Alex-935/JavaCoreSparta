package com.sparta.pcw.designpatterns.factorymethod.beverages;

public class FruitTea extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Putting the fruit tea bag into the mug and pouring boiling water.");
    }

    @Override
    public void serve() {
        System.out.println("Pass the fruit tea to the customer.");
    }

    @Override
    public String getName() {
        return "Fruit Tea";
    }
}
