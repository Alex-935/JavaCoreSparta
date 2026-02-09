package com.sparta.day6.animal;

public class Horse extends Animal {

    Horse(String name,  int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String speak() {
        return "Neigh";
    }
}
