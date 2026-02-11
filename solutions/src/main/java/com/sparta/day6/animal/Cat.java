package com.sparta.day6.animal;

public class Cat extends Animal {
    public Cat(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
