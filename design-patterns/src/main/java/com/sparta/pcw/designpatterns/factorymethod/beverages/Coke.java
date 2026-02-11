package com.sparta.pcw.designpatterns.factorymethod.beverages;

public class Coke extends Beverage{

    @Override
    public void prepare() {
        System.out.println("Open fridge and open bottle.... kaplunk");
    }

    @Override
    public void serve() {
        System.out.println("Pass bottle to customer");
    }

    @Override
    public String getName() {
        return "Coke";
    }
}
