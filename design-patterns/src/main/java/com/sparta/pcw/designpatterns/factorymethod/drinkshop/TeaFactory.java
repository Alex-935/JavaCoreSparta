package com.sparta.pcw.designpatterns.factorymethod.drinkshop;

import com.sparta.pcw.designpatterns.factorymethod.beverages.Beverage;
import com.sparta.pcw.designpatterns.factorymethod.beverages.FruitTea;

public class TeaFactory extends DrinkMaker {
    @Override
    protected Beverage brew(String type) {

        type = type.toLowerCase();

        return switch (type) {
            case "fruit" -> new FruitTea();
            default -> null;
        };
    }
}
