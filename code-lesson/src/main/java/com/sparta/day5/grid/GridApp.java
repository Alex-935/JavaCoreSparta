package com.sparta.day5.grid;

import java.util.Scanner;

public class GridApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.print("Please enter the number of columns: ");
        int c = scanner.nextInt();

        System.out.print("Please enter the number of rows: ");
        int r = scanner.nextInt();

        result.append(("*".repeat(c) + "%n").repeat(r));

        System.out.printf(result.toString());

    }
}
