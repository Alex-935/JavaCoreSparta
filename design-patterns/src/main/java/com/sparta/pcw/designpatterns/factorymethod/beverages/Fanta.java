package com.sparta.pcw.designpatterns.factorymethod.beverages;

public class Fanta extends Beverage {

    @Override
    public void prepare() {
        System.out.println("Open fridge and open can...kchussshshh");
    }

    @Override
    public void serve() {
        System.out.println("Pass can to customer");
    }

    @Override
    public String getName() {
        return "Fanta";
    }
}
