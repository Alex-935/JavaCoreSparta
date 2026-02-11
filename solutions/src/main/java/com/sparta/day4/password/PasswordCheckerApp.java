package com.sparta.day4.password;

import java.util.Scanner;

public class PasswordCheckerApp {
    static void main() {
        final String PWD = "Rocket";

        String password = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        password = scanner.nextLine();
        if (password.equalsIgnoreCase(PWD)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Your password didn't match");
        }
    }
}
