package com.sparta.day4.password;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PasswordCheckerApp passwordChecker = new PasswordCheckerApp(scanner);
    }
}
