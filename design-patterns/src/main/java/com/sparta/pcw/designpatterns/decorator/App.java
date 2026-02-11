package com.sparta.pcw.designpatterns.decorator;

import com.sparta.pcw.designpatterns.decorator.beverages.Espresso;
import com.sparta.pcw.designpatterns.decorator.decorators.Mocha;
import com.sparta.pcw.designpatterns.decorator.decorators.Soy;
import com.sparta.pcw.designpatterns.decorator.decorators.Whip;

public class App {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.printf("%s: £%.2f", espresso.description, espresso.getCost());

        System.out.println();

        Beverage espressoPlus = new Espresso();
        espressoPlus = new Mocha(espressoPlus);
        espressoPlus = new Mocha(espressoPlus);
        espressoPlus = new Soy(espressoPlus);
        System.out.printf("%s: £%.2f%n", espressoPlus.getDescription(), espressoPlus.getCost());


        Beverage superEspresso = new Whip(new Soy(new Mocha(new Mocha(new Espresso()))));
        System.out.printf("%s: £%.2f", superEspresso.getDescription(), superEspresso.getCost());
    }
}
