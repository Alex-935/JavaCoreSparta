package com.sparta.day5.averageposneg;

import java.util.Scanner;

public class AverageApp {
    static void main() {
        int[] inputValues = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers (positive or negative): ");
        for (int i = 0; i < inputValues.length; i++) {
            inputValues[i] = scanner.nextInt();
        }

        AverageProcessor avg = new AverageProcessor(inputValues);

        System.out.println(avg.getPositiveNumberResults());
        System.out.println(avg.getNegativeNumberResults());
    }
}
