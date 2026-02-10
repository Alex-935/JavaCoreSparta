package com.sparta.lessons.interfaces;

public class Square extends Shape {

    private double length;

    Square(double length) {

        this.length = length;
    }

    @Override
    public double calculateArea() {
        return this.length * this.length;
    }
}
