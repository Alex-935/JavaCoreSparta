package com.sparta.day6.animal;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    protected String name = "";
    private LocalDate birthdate;

    public Animal(String name, int year, int month, int day) {
        this.name = name;
        birthdate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public abstract String speak();
}
