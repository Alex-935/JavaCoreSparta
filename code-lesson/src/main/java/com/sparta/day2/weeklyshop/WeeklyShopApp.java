package com.sparta.day2.weeklyshop;

import java.util.Scanner;

public class WeeklyShopApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many peaches do you want: ");
        int peaches = scanner.nextInt();
        System.out.print("How much do they cost: ");
        scanner.nextLine();
        float peachesCost= Float.valueOf(scanner.nextLine());

        System.out.print("How many beans do you want: ");
        int beans = scanner.nextInt();
        System.out.print("How much do they cost: ");
        scanner.nextLine();
        float beansCost= Float.valueOf(scanner.nextLine());

        System.out.print("How many chicken pieces do you want: ");
        int chickenPieces = scanner.nextInt();
        System.out.print("How much do they cost: ");
        scanner.nextLine();
        float chickenPiecesCost= Float.valueOf(scanner.nextLine());

        System.out.print("How many socks do you want: ");
        int socks = scanner.nextInt();
        System.out.print("How much do they cost: ");
        scanner.nextLine();
        float socksCost= Float.valueOf(scanner.nextLine());

        System.out.print("How many bottles of water do you want: ");
        int water = scanner.nextInt();
        System.out.print("How much do they cost: ");
        scanner.nextLine();
        float waterCost= Float.valueOf(scanner.nextLine());

        System.out.println("Total number of items purchased: " +
                (peaches + beans + chickenPieces + socks + water));

        float total = ((peaches * peachesCost) + (beans * beansCost) + (chickenPieces * chickenPiecesCost) + (socks * socksCost) + (water * waterCost));
        System.out.printf("Your weekly shop cost: %.2f", total);


    }
}
