package com.sparta.lessons.abstraction;

public class Customer extends Person {

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void delete() {
        System.out.println("The customer has closed their account");
    }

    @Override

    public void print() {
        System.out.println("I am a customer");
    }
}
