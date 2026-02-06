package com.sparta.day2.cuboid;

import java.util.Scanner;

public class CuboidApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the width: ");
        float length = Float.valueOf(scanner.nextLine());

        System.out.print("Please enter the width of the width: ");
        float width = Float.valueOf(scanner.nextLine());

        System.out.print("Please enter the height of the width: ");
        float height = Float.valueOf(scanner.nextLine());

        System.out.println("The surface area is: " + ((length*width*2) + (width*height*2) + (length*height*2)) + " units.");
        System.out.println("The area is: " + (length*width*height) + " square units");
    }
}
