package com.sparta.day5.diamond;

import java.util.Scanner;

public class DiamondApp {

    DiamondApp() {

        /*
        ---*---
        --*-*--
        -*-*-*-
        *-*-*-*
        -*-*-*-
        --*-*--
        ---*---

        let n be the number of stars in the middle row
        (n-1)- , * , (n-1)-

        stars: n, spaces: (n-1)
         */

        Scanner scanner = new Scanner(System.in);

        int middleStars = getInt(scanner);
        // creates an array of the length of the number of stars in the middle row
        String[] rowsArray = createRowsArray(middleStars);

    }

    int getInt(Scanner scanner) {

        do {
            try {
                System.out.print("Please enter number between 2 and 40: ");
                int num = Integer.parseInt(scanner.nextLine());

                if (2 <= num && num <= 40) {
                    return num;
                }
                else {
                    System.out.println("The number must be between 2 and 40.");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            }
        } while (true);
    }

    String[] createRowsArray(int numStars) {

        String[] rowsArray = new String[numStars];


        return rowsArray;
    }
}
