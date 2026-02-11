package com.sparta.pcw.designpatterns.factorymethod.drinkshop;

import com.sparta.pcw.designpatterns.factorymethod.beverages.Beverage;

public abstract class DrinkMaker {
    public Beverage orderDrink(String type) {

        Beverage beverage = brew(type);

        if (beverage != null) {
            beverage.prepare();
            beverage.serve();
        }
        return beverage;
    }

    protected abstract Beverage brew(String type);
}
