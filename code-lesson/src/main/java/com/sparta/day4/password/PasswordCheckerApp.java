package com.sparta.day4.password;

import java.util.Scanner;

public class PasswordCheckerApp {

    PasswordCheckerApp(Scanner scanner) {

        final String PWD = "Rocket";

        System.out.print("Please enter your password: ");
        String userPassword = scanner.nextLine();
        System.out.println((PWD.equalsIgnoreCase(userPassword)) ? "Welcome to your System" : "Password Incorrect");
    }
}
