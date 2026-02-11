package com.sparta.day5.diamond;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiamondApp {
    static void main() {
        int height;
        List<String> diamondRows = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter diamond width (2-40): ");
        height = sanitise(scanner.nextInt());

        int count = 1;
        for (int i = 0; i < height; i++) {
            StringBuilder row = new StringBuilder();
            String leadingSpaces = " ".repeat(height - i - 1);
            row.append(leadingSpaces);
            System.out.print(leadingSpaces);
            for (int j = 1; j <= count; j++) {
                if (j % 2 == 0) {
                    row.append(" ");
                    System.out.print(" ");
                } else {
                    row.append("*");
                    System.out.print("*");
                }
            }
            diamondRows.add(row.toString());
            count += 2;
            System.out.println();
        }
        for (int i = height - 2; i >= 0; i--) {
            System.out.println(diamondRows.get(i));
        }
    }

    private static int sanitise(int num) {
        if (num > 40) num = 40;
        if (num < 2) num = 2;
        return num;
    }
}
