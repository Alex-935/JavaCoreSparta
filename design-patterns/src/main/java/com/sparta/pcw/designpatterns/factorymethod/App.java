package com.sparta.pcw.designpatterns.factorymethod;

import com.sparta.pcw.designpatterns.factorymethod.beverages.Beverage;
import com.sparta.pcw.designpatterns.factorymethod.drinkshop.CoffeeFactory;
import com.sparta.pcw.designpatterns.factorymethod.drinkshop.DrinkMaker;
import com.sparta.pcw.designpatterns.factorymethod.drinkshop.SodaFactory;
import com.sparta.pcw.designpatterns.factorymethod.drinkshop.TeaFactory;

public class App {

    public static void main(String[] args) {

        DrinkMaker teaMaker = new TeaFactory();
        DrinkMaker coffeeMaker = new CoffeeFactory();
        SodaFactory sodaFactory = new SodaFactory();

        var fruitTea = getDrink("Fruit", teaMaker);
        var espresso = getDrink("Espresso", coffeeMaker);
        var flatWhite = getDrink("FlatWhite", coffeeMaker);
        var coke = getDrink("Coke", sodaFactory);
        var fanta = getDrink("Fanta", sodaFactory);
    }

    private static Beverage getDrink(String drinkType, DrinkMaker drinkFactory) {

        Beverage drink = drinkFactory.orderDrink(drinkType);
        if (drink != null) {
            System.out.printf("Here's your %s, have a great day!", drink.getName());
        }
        System.out.println();
        return drink;
    }
}
