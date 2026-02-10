package com.sparta.lessons.exceptions;

import java.text.ParseException;

public class App {

    public static void main(String[] args) {

    /*
        Error - a dynamic linking failure or hardware level or other hard failure that you cannot recover from
              - Syntax Error: problem with how the code is written and prevents compilation
              - Logical Error: the code does something you didn't intend
              - Run-Time Error: the code
              // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Error.html


        Exception - when something unexpected happens but its recoverable
            - checked exceptions: can be picked up at compile time but only happen during compile time
                        - the compiler wont let you compile until you handle it
            - https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html
            - unchecked exceptions: run-time exceptions
            // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html


        Throwable class - https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Throwable.html
                        - used to get more information on an exception
     */

        Animal myDog = new Animal("Fido", 10);
        Animal myCat = new Animal();

        System.out.println(myDog.getName());
        // the compiler hasnt picked up on the .toUpperCase on the empty styring
        // so this is a run-time-exception

        try {
            System.out.println(myCat.getName());
        } catch (NullPointerException e) {
            System.out.println("That animal does not have a name.");
        }

        // we have to handle the error here as we used throws ParseException where it was defined
        try {
            myCat.setVaccinationDate("10-05-2015");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        try {
            myDog.setVaccinationDate("15 June, 2018");
        } catch (ParseException e) {
            System.out.println("Invalid date format, should be \"dd-MM-yyyy\"");
        } catch (Exception e) {
            System.out.println("Main exception");
        }
        finally {
            System.out.println("All done");
        }

        try {
            myDog.setVaccinationDate("18-08-2020");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Program is finished");
    }
}
