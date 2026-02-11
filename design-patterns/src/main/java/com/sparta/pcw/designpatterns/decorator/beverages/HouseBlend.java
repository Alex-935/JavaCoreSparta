package com.sparta.pcw.designpatterns.decorator.beverages;

import com.sparta.pcw.designpatterns.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
