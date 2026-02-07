package com.sparta.lessons.junitintro;

public class App {

    public static void main(String[] args) {

        int timeOfDay = 21;
        System.out.println(greeting(timeOfDay));

        /*
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            System.out.println("Good moring!");
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            System.out.println("Good afteroon!");
        else {
            System.out.println("Good evening!");
         */
        /*
            The above code isn't very testable as:
                - it's not in its own method, so cannot be tested individually
                - doesn't return anything, sout cannot be tracked by code
         */
    }

    // default access modifier is package-private
    // package-private - visible to the class itself or the same package.
    static String greeting(int timeOfDay) {
        if (timeOfDay >= 5 && timeOfDay <= 12) {
            return "Good Morning!";
        }
        else if (timeOfDay > 12 && timeOfDay <= 18) {
            return "Good Afternoon!";
        }
        else {
            return "Good Evening!";
        }
    }
}
