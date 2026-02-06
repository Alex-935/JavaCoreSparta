package com.sparta.day4.thunderbirds;

import java.util.Scanner;

public class ThunderbirdApp {

    ThunderbirdApp(Scanner scanner) {

        int crewNumber = getInt(scanner);
        System.out.println(thunderbirdName(crewNumber));
    }

    int getInt(Scanner scanner){

        do {
            try {
                System.out.print("Please enter the number of a thunderbird: ");
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
            }
        }while (true);
    }

    String thunderbirdName(int crewNumber) {

        return switch (crewNumber) {
            case 1 -> "Thunderbird 1 pilot is Scott Tracy";
            case 2 -> "Thunderbird 2 pilot is Virgil Tracy";
            case 3 -> "Thunderbird 3 pilot is Alan Tracy";
            case 4 -> "Thunderbird 4 pilot is Gordon Tracy";
            case 5 -> "Thunderbird 5 pilot is John Tracy";
            default -> "Have you ever watched Thunderbirds!?";
        };
    }
}
