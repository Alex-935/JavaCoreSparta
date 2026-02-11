package com.sparta.day8.factorymethod.instruments;

public class Ibanez extends Instrument{

    @Override
    public void build() {
        System.out.println("Building your Ibanez");
    }

    @Override
    public void test() {
        System.out.println("Playing Master of Puppets");
    }

    @Override
    public void giveToCustomer() {
        System.out.println("Here is your Ibanez");
    }

    @Override
    public String getName() {
        return "Ibanez";
    }
}
