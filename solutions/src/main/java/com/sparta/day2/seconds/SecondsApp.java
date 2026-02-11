package com.sparta.day2.seconds;

import java.util.Scanner;

public class SecondsApp {
    static void main() {
        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = SECONDS_IN_MINUTE * 60;
        final int COL1 = 7;
        final int COL2 = 7;
        final int COL3 = 9;
        final int COL4 = 9;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of seconds: ");
        int input = scanner.nextInt();

        int hours = input / SECONDS_IN_HOUR;
        int minutes = (input - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = input % SECONDS_IN_MINUTE;

        System.out.printf("%-" + COL1 + "s%" + COL2 + "s%" + COL3 + "s%" + COL4 + "s%n", "Input", "Hours", "Minutes", "Seconds");
        System.out.printf("%-" + COL1 + "d%" + COL2 + "d%" + COL3 + "d%" + COL4 + "d", input, hours, minutes, seconds);
    }
}
