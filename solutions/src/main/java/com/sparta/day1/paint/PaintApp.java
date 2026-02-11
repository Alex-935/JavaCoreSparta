package com.sparta.day1.paint;

public class PaintApp {
    static void main() {
        double canCoverage = 5.1;

        int canDiameter = 15;
        int canHeight = 30;

        int boxHeight = 35;
        int boxWidth = 30;
        int boxLength = 60;

        double shortWallArea = 30 * 3.4;
        double largeWallArea = 40 * 3.4;

        int minimumNumberOfCans = (int)Math.ceil((shortWallArea * 2 + largeWallArea * 2) / 5.1);
        int cansInABox = (boxHeight / canHeight) * (boxWidth / canDiameter) * (boxLength / canDiameter);
        int fullBoxes = minimumNumberOfCans / cansInABox;
        int cansNotPacked = minimumNumberOfCans % cansInABox;

        System.out.printf("Minimum number of cans required: %d%n", minimumNumberOfCans);
        System.out.printf("Number of full boxes: %d%n", fullBoxes);
        System.out.printf("Number of cans not packed: %d", cansNotPacked);
    }
}
