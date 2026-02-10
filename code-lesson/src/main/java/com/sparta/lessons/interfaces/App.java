package com.sparta.lessons.interfaces;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main() {

        Circle circle = new Circle(12.0);
        Square square = new Square(8.0);

        List<Shape> shapes = new ArrayList<>(List.of(circle, square));
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
