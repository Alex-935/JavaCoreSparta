package com.sparta.lessons.abstraction;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Employee employee = new Employee("Brandon", "Johnson");
        employee.delete();

        Customer customer = new Customer("Brandon", "Johnson");
        customer.delete();

        Person customer2 = new Customer("Fred", "Stevens");

        // you can have a list of abstract types but you cannot instantiate them
        List<Person> people = new ArrayList<>(List.of(employee, customer));

        for (Person person : people) {
            person.delete();
        }

        Circle circle = new Circle(12.0);
        Square square = new Square(8.0);

        List<Shape> shapes = new ArrayList<>(List.of(circle, square));
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }


        List<Printable> printOut = new ArrayList<>(List.of(customer, employee, square));

        // only allows you to call method within Printable and Object
        // cant call calculateArea for example
        for (Printable obj : printOut) {
            obj.print();
        }
    }

    public static void print(Printable obj) {

    }
}
