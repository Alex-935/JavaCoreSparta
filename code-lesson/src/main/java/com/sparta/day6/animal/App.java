package com.sparta.day6.animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Animal oguri = new Horse("Oguri Cap", 1985, 3, 27);
        Animal rimuru = new Slime("Rimuru Tempest", 2000, 4, 17);
        Animal programmer = new Programmer("Dave", 1981, 6, 23, "League of Legends");

        List<Animal> animals = new ArrayList<>(Arrays.asList(oguri, rimuru, programmer));

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.printf("Say hello %s: %s.%n%n", animal.getName(), animal.speak());
        }
    }
}
