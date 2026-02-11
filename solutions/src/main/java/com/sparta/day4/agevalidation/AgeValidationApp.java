package com.sparta.day4.agevalidation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeValidationApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your date of birth (yyyy/mm/dd): ");
        String dob = scanner.nextLine();

        if (name.equals("")) {
            System.out.println("You didn't enter a name.");
        } else {
            System.out.println("You are " + name);
        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate birthDate = LocalDate.parse(dob, format);

        if (birthDate.isAfter(LocalDate.now().minusYears(18))) {
            System.out.println("You are not over 18.");
        } else {
            System.out.println("You are over 18.");
        }
    }
}
