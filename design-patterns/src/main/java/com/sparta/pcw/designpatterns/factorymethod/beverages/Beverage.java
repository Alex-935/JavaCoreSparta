package com.sparta.pcw.designpatterns.factorymethod.beverages;

public abstract class Beverage {
    public abstract void prepare();
    public abstract void serve();
    public abstract String getName();
}
