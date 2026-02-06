package com.sparta.day5.averageposneg;

import java.util.Scanner;
import java.util.Arrays;
import com.sparta.day5.calculator.CalculatorApp;

public class AverageApp {

    AverageApp() {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = CalculatorApp.getInt(i+1, scanner);
        }

        int positiveTotal = 0, negativeTotal;
        int positiveSum = 0, negativeSum = 0;

        for (int num : numbers) {
            if (num >= 0) {
                positiveSum += num;
                positiveTotal++;
            }
            else {
                negativeSum += num;
            }
        }
        negativeTotal = 10 - positiveTotal;

        if (positiveTotal > 0) {
            System.out.printf("The sum of the positive integers is: %d%nThe average of the positive numbers is: %.2f%n", positiveSum, (double) positiveSum/positiveTotal);
        }
        else {
            System.out.println("There were no positive integers");
        }
        if (negativeTotal > 0) {
            System.out.printf("The sum of the negative integers is: %d%nThe average of the negative numbers is: %.2f%n", negativeSum, (double) negativeSum/negativeTotal);
        }
        else {
            System.out.println("There were no negative integers");
        }
    }


}
