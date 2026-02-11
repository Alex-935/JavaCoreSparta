package com.sparta.pcw.designpatterns.factorymethod.drinkshop;

import com.sparta.pcw.designpatterns.factorymethod.beverages.Beverage;
import com.sparta.pcw.designpatterns.factorymethod.beverages.Coke;
import com.sparta.pcw.designpatterns.factorymethod.beverages.Fanta;

public class SodaFactory extends DrinkMaker {

    @Override
    protected Beverage brew(String type) {

        type = type.toLowerCase();

        return switch(type) {
            case "coke" -> new Coke();
            case "fanta" -> new Fanta();
            default -> null;
        };
    }
}
