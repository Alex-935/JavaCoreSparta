package com.sparta.day4.thunderbirds;

import java.util.Scanner;

public class ThunderbirdApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number 1-4: ");
        switch (scanner.nextInt()) {
            case 1 -> System.out.println("Thunderbird 1 pilot is Scott Tracy");
            case 2 -> System.out.println("Thunderbird 2 pilot is Virgil Tracy");
            case 3 -> System.out.println("Thunderbird 3 pilot is Alan Tracy");
            case 4 -> System.out.println("Thunderbird 4 pilot is Gordon Tracy");
            default -> System.out.println("Have you never watched Thunderbirds!");
        }
    }
}
