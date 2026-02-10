package com.sparta.lessons.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

    private String name;// null value by default, initialing to "" can prevent exceptions
    private int age;
    private Date vaccinationDate;


    public Animal() {}

    public Animal(String name, int age) {

        setName(name);
        setAge(age);
    }


    public String getName() {
        try {
            return name.toUpperCase();
        }
        catch (NullPointerException e) {
            // e is equivalent to e.toString()
            System.out.println("Caught exception: " + e);
            throw new NullPointerException("Animal has no name");
        }
    }


    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vaccinationDate=" + vaccinationDate +
                '}';
    }

    public void setVaccinationDate(String dateString) throws ParseException {
        //this is a checked error as it will force you to deal with it
        // you can use throws ParseException to deal with it where the method is called

        // we could also just wrap it in a try catch block here instead
        vaccinationDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
    }
}