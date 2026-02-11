package com.sparta.day1.debug;

public class DebugApp {
    static void main() {
        var name = "Josh Crabtree";
        String occupation = "trainee";
        String location = "London";
        var activityLevel = "moderate";

        System.out.println("My name is " + name);
        System.out.printf("I am a %s in %s%n", occupation, location);

        int age = 21;

        System.out.print("I am " + age + " years of age with a " + activityLevel + " activity level");

    }
}
