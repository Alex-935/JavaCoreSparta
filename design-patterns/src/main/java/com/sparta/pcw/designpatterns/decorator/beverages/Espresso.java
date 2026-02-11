package com.sparta.pcw.designpatterns.decorator.beverages;

import com.sparta.pcw.designpatterns.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
