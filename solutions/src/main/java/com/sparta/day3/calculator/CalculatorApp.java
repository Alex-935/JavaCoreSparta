package com.sparta.day3.calculator;

import java.util.Scanner;

public class CalculatorApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("%d / %d = %f", num1, num2, (double)num1 / num2);
    }
}
