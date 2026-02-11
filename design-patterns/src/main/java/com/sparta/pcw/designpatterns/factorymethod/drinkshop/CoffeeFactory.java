package com.sparta.pcw.designpatterns.factorymethod.drinkshop;

import com.sparta.pcw.designpatterns.factorymethod.beverages.Beverage;
import com.sparta.pcw.designpatterns.factorymethod.beverages.Espresso;

import java.util.Calendar;

public class CoffeeFactory extends DrinkMaker {
    @Override
    protected Beverage brew(String type) {

        type = type.toLowerCase();

        return switch (type) {
            case "espresso" -> new Espresso();
            default -> null;
        };
    }
}
