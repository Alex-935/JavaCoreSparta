package com.sparta.pcw.designpatterns.decorator.decorators;

import com.sparta.pcw.designpatterns.decorator.Beverage;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return 0.2 + beverage.getCost();
    }
}
