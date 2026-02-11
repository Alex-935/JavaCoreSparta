package com.sparta.day3.average;

import java.util.Scanner;

public class AverageApp {
    static void main() {
        Scanner scanner =   new Scanner(System.in);
        int total = 0;

        System.out.print("Enter 4 integers: ");
        for (int i = 0; i < 4; i++) {
            total += scanner.nextInt();
        }

        System.out.println("Average was: " + total / 4.0F);
    }
}
