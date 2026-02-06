package com.sparta.lessons;

public class Strings {

    public static void main() {

        // == always compares items in the stack,
        //which is why we cannot use == on Strings as it is comparing the reference

        /*
            Strings are stored in a special section of the heap called the string pool
            Strings are defined with the keyword 'final' behind the scenes so cannot be changed post-initialisation

            When a string is "changed", a second string is created in the string pool and the reference is changed
            The reference is stored in stack as a primitive

            String name = new String("Phil"), creates a string in the general heap
         */

        /*
            String Builder:
                StringBuilder cuts down on memory used by continuously changing string values
                It adds references to each string before building them all at once with .toString()
         */
        stringBuilderDemo();

    }

    static void stringBuilderDemo() {

        String[] firstNames = {"Aiden", "Alvaro", "Andrew", "Antony", "Autumn",
                                "Ben", "Brandon", "Conor", "Dale"};
        StringBuilder result = new StringBuilder();

        for (String firstName: firstNames) {
            result.append(firstName);
            result.append(" ");
        }

        // You use append to keep adding stuff to the string builder
        // and the .toString() to build the final result
        // this prevents making lots of small strings along the way as,
        // the final string is built once
        System.out.println(result.toString());

    }
}
