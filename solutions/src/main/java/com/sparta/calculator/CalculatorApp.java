package com.sparta.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorApp {
    static void main() {
        Calculator calculator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers and an operator to calculate: ");
        calculator = new Calculator(scanner.nextInt(), scanner.nextInt(), scanner.nextLine());

        System.out.printf(
                "Your sum is %d %s %d and the answer is %s",
                calculator.getNum1(),
                calculator.getOperator(),
                calculator.getNum2(),
                new DecimalFormat().format(calculator.getResult()));
    }
}
