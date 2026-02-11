package com.sparta.day2.cuboid;

import java.util.Scanner;

public class CuboidApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the width, length, and height of the cube: ");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int height = scanner.nextInt();

        int surfaceArea = (width * length + width * height + length * height) * 2;
        int volume = width * length * height;

        System.out.printf("The surface area of the cube is: %d%n", surfaceArea);
        System.out.printf("The volume of the cube is: %d%n", volume);
    }
}
