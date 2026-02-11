package com.sparta.pcw.codesmellsrefactoring;

public class Person {
    private final String firstName;
    private final String lastName;
    private int age;
    private Address address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String fName, String lName, Address address) {
        this(fName, lName);
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String move() {
        return "Walking along";
    }

    @Override
    public String toString() {
        return String.format("%s Name: %s Age: %s. %s",
                super.toString(),
                getFullName(),
                age,
                address.getAddress());
    }



//    public int stupidMethod()
//    {
//        return 3;
//    }
}