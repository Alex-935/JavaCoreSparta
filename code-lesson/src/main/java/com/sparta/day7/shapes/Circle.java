package com.sparta.day7.shapes;

import java.lang.Math;

public class Circle extends Shape {

    private double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
