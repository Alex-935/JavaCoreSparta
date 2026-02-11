package com.sparta.pcw.designpatterns.decorator.decorators;

import com.sparta.pcw.designpatterns.decorator.Beverage;

public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return  0.5 + beverage.getCost();
    }
}
