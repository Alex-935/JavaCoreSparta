package com.sparta.day3.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = getInt("first");
        int num2 = getInt("second");

        /*
        System.out.printLine("Please enter the first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
         */

        System.out.println("The result is: " + ((float) num1 / num2));
    }


    //Asks the user for an integer input and validates it
    public static int getInt(String position) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create variable to
        boolean validated = false;

        do {
            System.out.printf("Please enter the %s integer: ", position);
            //attempt to convert string to int
            try {
                int num = Integer.parseInt(scanner.nextLine());
                /* no scanner.nextLine(); needed as as soon as we run into an
                error, its discarded */

                return num;
            }
            // if the user didn't input an integer
            catch (NumberFormatException e) {
                System.out.println("Please make sure you enter an integer");
            }
            catch (Exception e) {
                System.out.println("Please never do that again");
            }
        } while (!validated);

        return -1;
    }

    //Asks the user for an integer input and validates it
    // version for no argument
    //Asks the user for an integer input and validates it
    public static int getInt() {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // create variable to
        boolean validated = false;

        do {
            System.out.println("Please enter the your integer: ");
            //attempt to convert string to int
            try {
                int num = Integer.parseInt(scanner.nextLine());
                /* no scanner.nextLine(); needed as as soon as we run into an
                error, its discarded */

                return num;
            }
            // if the user didn't input an integer
            catch (NumberFormatException e) {
                System.out.println("Please make sure you enter an integer");
            }
            catch (Exception e) {
                System.out.println("Please never do that again");
            }
        } while (!validated);

        return -1;
    }
}
