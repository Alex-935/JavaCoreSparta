package com.sparta.day6.animal;

import java.time.LocalDate;

public abstract class Animal {

    private String name;
    private LocalDate birthdate;

    Animal(String name, int year, int month, int day) {

        this.name = name;
        this.birthdate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthdate.getYear();
    }

    @Override
    public String toString() {
        return this.getName() + " is " + this.getAge() + " years old.";
    }

    public abstract String speak();
}
