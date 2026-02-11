package com.sparta.pcw.designpatterns.decorator;

public abstract class Beverage {

    protected String description = "No beverage";
    public String getDescription() {
        return description;
    }
    public abstract double getCost();
}
