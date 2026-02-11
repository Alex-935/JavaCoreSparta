package com.sparta.day2.distancecalculator;

import java.util.Scanner;

public class DistanceCalculatorApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the initial velocity (m/s): ");
        int velocity = scanner.nextInt();
        System.out.print("Please enter the time taken (seconds): ");
        int timeTaken = scanner.nextInt();
        System.out.print("Please enter the acceleration (m/s): ");
        int acceleration = scanner.nextInt();

        double distance = velocity * timeTaken + 0.5 * acceleration * timeTaken * timeTaken;
        System.out.println(distance);
    }
}
