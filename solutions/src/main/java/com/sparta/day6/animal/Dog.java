package com.sparta.day6.animal;

public class Dog extends Animal {
    private String favouriteGame = "";

    public Dog(String name, int year, int month, int day, String favouriteGame) {
        super(name, year, month, day);
        this.favouriteGame = favouriteGame;
    }

    @Override
    public String speak() {
        return "woof, woof";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                ", favouriteGame='" + favouriteGame + '\'' +
                '}';
    }
}
