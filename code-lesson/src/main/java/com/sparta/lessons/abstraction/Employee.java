package com.sparta.lessons.abstraction;

public class Employee extends Person{

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void delete() {
        System.out.println("This employee has left the company.");
    }

    @Override

    public void print() {
        System.out.println("I am an employee");
    }
}
