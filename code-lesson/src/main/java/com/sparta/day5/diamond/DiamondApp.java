package com.sparta.day5.diamond;

import java.util.Scanner;

public class DiamondApp {

    private Scanner scanner;
    private StringBuilder patternBuilder;
    private StringBuilder rowString;
    private StringBuilder diamondBuilder;// to construct the diamond shape
    private String[] rowsArray;
    private int middleStars;// width of middle diamond row
    private String finalDiamond;


    DiamondApp() {

        /*
        ---*---
        --*-*--
        -*-*-*-
        *-*-*-*
        -*-*-*-
        --*-*--
        ---*---

        Width of middle row: n, number of rows: r
        n = 1, r = 1,
        n = 2, r = 3,
        n = 3, r = 5,
        n = 4, r = 7
        for n = n, r = 2n -1
        only n are unique

        let n be the number of stars in the middle row
        (n-r)- , * , (n-r)-

        width: n, stars: (r)
         */

        //initialising objects
        this.scanner = new Scanner(System.in);
        this.patternBuilder = new StringBuilder();
        this.rowString = new StringBuilder();
        this.diamondBuilder = new StringBuilder();

        // initialising attributes
        this.middleStars = getInt(scanner);
        // creates an array of the length of the number of stars in the middle row
        this.rowsArray = new String[this.middleStars];

        //adds each row of the diamond to the rowsArray up to and including the middle row
        populateRowsArray(this.middleStars);

        // construct final diamond
        this.finalDiamond = buildDiamond();
    }


    // getter for diamond shape
    public String getDiamond() {
        return this.finalDiamond;
    }



    // gets width of middle row from user and chacks it's an int beween 2 and 40
    int getInt(Scanner scanner) {
        do {
            try {
                // get int from user
                System.out.print("Please enter number between 2 and 40: ");
                int num = Integer.parseInt(scanner.nextLine());

                // check it's between 2 and 40
                if (2 <= num && num <= 40) {
                    return num;
                }
                else {
                    System.out.println("The number must be between 2 and 40.");
                }
            }
            // catch error from converting user input to int
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            }
        } while (true);
    }



    // add each row in the diamond to the array up to max width
    void populateRowsArray(int numStars) {

        // builds the string for each row
        for (int i = 1; i < numStars +1; i++) {

            // clears rowString StringBuilder from previous iteration
            this.rowString.setLength(0);

            // build string using (Spaces: n-r) + (Stars with spaces: r) + (Spaces: n-r pattern)
            this.rowString.append(" ".repeat(this.middleStars - i));
            this.rowString.append(starPattern(i));
            // technically can be omitted as isn't visible anyway
            this.rowString.append(" ".repeat(this.middleStars - i));

            // adds row string to rowsArray
            this.rowsArray[i-1] = this.rowString.toString();
        }
    }


    // creates the '* *' pattern in the middle of each row
    String starPattern(int stars) {

        // clear string builder from previous iteration
        this.patternBuilder.setLength(0);

        // adds '* ' the number of times needed
        for (int i = 0; i < stars-1; i++) {
            this.patternBuilder.append("* ");
        }
        // add final '*' on end
        this.patternBuilder.append("*");

        // return pattern string
        return this.patternBuilder.toString();
    }


    String buildDiamond() {

        // adds top pyramid to diamondBuilder
        for (String row : rowsArray) {
            diamondBuilder.append(row);
            diamondBuilder.append("%n");
        }

        //adds bottom pyramid to diamondBuilder
        for (int i = rowsArray.length-2; i >= 0; i--) {
            diamondBuilder.append(rowsArray[i]);
            diamondBuilder.append("%n");
        }

        return diamondBuilder.toString();
    }
}
