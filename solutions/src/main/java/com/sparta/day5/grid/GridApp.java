package com.sparta.day5.grid;

import java.util.Scanner;

public class GridApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width and height of grid: ");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
           for (int j = 0; j < width; j++) {
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}
