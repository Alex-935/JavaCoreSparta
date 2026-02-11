package com.sparta.day6.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    static void main() {
        List<Animal> pets = new ArrayList<>();

        Cat tiddles = new Cat("Tiddles", 2019, 6, 20);
        Dog fido = new Dog("Fido", 2021, 3, 24, "fetch");

        pets.add(tiddles);
        pets.add(fido);

        for (Animal pet: pets) {
            System.out.println(pet.toString() + " says " + pet.speak());
        }
    }
}
