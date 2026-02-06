package com.sparta.day4.series;

import java.util.Scanner;

public class SeriesApp {

    public static void main(String[] args) {

        // initialise scanner
        Scanner scanner = new Scanner(System.in);
        // sums of numbers
        int positiveSum = 0, negativeSum = 0;

        // we want 5 numbers
        for (int i = 0; i < 5; i++) {

            int num = getNonZeroInt(scanner, i);

            if (num > 0) {
                positiveSum += num;
            }
            else {
                negativeSum += num;
            }
        }

        System.out.printf("""
                Sum of positive integers: %d
                Sum of negative integers: %d
                """, positiveSum, negativeSum);
    }

    static int getNonZeroInt(Scanner scanner, int i) {

        do {
            try {
                System.out.printf("Please enter number %d: ", i+1);
                int num = Integer.parseInt(scanner.nextLine());

                if (num == 0) {
                    throw new Exception();
                }
                else {
                    return num;
                }
            }
            catch (Exception e) {
                System.out.println("You must enter a non-zero integer");
            }
        } while (true);
    }
}
