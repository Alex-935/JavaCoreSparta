package com.sparta.lessons.abstraction;

public class Square extends Shape implements Printable {

    private double side;

    Square(double side) {

        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void print() {
        System.out.printf("A square with a side of %s has an area of %s%n", this.side, calculateArea());
    }
}
