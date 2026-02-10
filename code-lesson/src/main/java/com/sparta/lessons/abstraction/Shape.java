package com.sparta.lessons.abstraction;

public abstract class Shape {

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "The area is: " + this.calculateArea();
    }
}
