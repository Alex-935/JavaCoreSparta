package com.sparta.day4.agevalidation;

import java.util.Scanner;

public class AgeValidationApp {

    AgeValidationApp() {

        // set-up scanner
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        int age = getAge(scanner);

        System.out.printf("""
                %s
                %s
                """,
                (checkName(name) ? "You entered a valid name" : "You did not enter a valid name"),
                (checkAge(age)) ? "You are older than 18" : "You are not older than 18");
    }

    String getName(Scanner scanner) {
        System.out.print("Please enter your name: ");
        return scanner.nextLine();
    }

    int getAge(Scanner scanner) {

        do {
            System.out.print("Please enter your age: ");
            try {
                int age = Integer.parseInt(scanner.nextLine());

                if (age >= 0 && age < 130) {
                    return age;
                }
                // will only run if age is not valid
                throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Please enter a valid age.");
            }
        } while (true);
    }

    boolean checkName(String name) {
        return !name.equals("");
    }

    boolean checkAge(int age) {
        return age > 18;
    }
}

