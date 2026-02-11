package com.sparta.day4.series;

import java.util.Scanner;

public class SeriesApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int posTotal = 0;
        int negTotal = 0;

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            if (input > 0) {
                posTotal += input;
            } else {
                negTotal += input;
            }
        }

        System.out.printf("Sum of positive integers: %d%n", posTotal);
        System.out.printf("Sum of negative integers: %d", negTotal);
    }
}
