package com.sparta.lessons.interfaces;

public abstract class Shape {

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "The area is: " + this.calculateArea();
    }
}
