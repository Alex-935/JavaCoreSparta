package com.sparta.day6.animal;

public class Slime extends Animal {

    Slime(String name,  int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String speak() {
        return "Hiya";
    }
}
