package com.sparta.day2.address;

import java.util.Scanner;

public class AddressApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Please enter your house number: ");
        String houseNumber = scanner.nextLine();
        System.out.print("Please enter your road: ");
        String road = scanner.nextLine();
        System.out.print("Please enter your town: ");
        String town = scanner.nextLine();

        System.out.printf("Mr and Mrs %s,%n%s, %s%n%s", surname, houseNumber, road, town);
    }
}
