package com.sparta.day5.calculator;

import java.util.Scanner;

public class CalculatorApp {

    CalculatorApp() {

        Scanner scanner = new Scanner(System.in);

        int num1 = getInt(1, scanner), num2 = getInt(2, scanner);
        char operation = getOperation(scanner);

        switch (operation) {
            case '+':
                System.out.printf("%d + %d = %d", num1, num2, num1+num2);
                break;
            case '-':
                System.out.printf("%d - %d = %d", num1, num2, num1-num2);
                break;
            case '*':
                System.out.printf("%d * %d = %d", num1, num2, num1*num2);
                break;
            default:
                System.out.printf("%d / %d = %.2f", num1, num2, (double) num1/num2);
                break;
        }
    }

    public static int getInt(int position, Scanner scanner) {

        do {
            try {
                System.out.printf("Please enter number %d: ", position);
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            }
        } while (true);
    }

    public char getOperation(Scanner scanner) {

        do{
            System.out.print("Which operator do you want to use (+, -, *, /): ");
            String operator = scanner.nextLine();

            switch (operator) {
                case "+": return '+';
                case "-": return '-';
                case "*": return '*';
                case "/": return '/';
                default: continue;
            }

        } while (true);
    }
}
