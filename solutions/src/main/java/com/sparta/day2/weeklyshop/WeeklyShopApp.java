package com.sparta.day2.weeklyshop;

import java.util.Scanner;

public class WeeklyShopApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peaches - Quantity? Price? ");
        int peachesQty = scanner.nextInt();
        double peachesPrice = scanner.nextDouble();
        System.out.print("Can of Beans - Quantity? Price? ");
        int beansQty = scanner.nextInt();
        double beansPrice = scanner.nextDouble();
        System.out.print("Packet of Chicken Pieces - Quantity? Price? ");
        int chickenQty = scanner.nextInt();
        double chickenPrice = scanner.nextDouble();
        System.out.print("Pair of Socks - Quantity? Price? ");
        int socksQty = scanner.nextInt();
        double socksPrice = scanner.nextDouble();
        System.out.print("Bottle of Water - Quantity? Price? ");
        int waterQty = scanner.nextInt();
        double waterPrice = scanner.nextDouble();

        System.out.printf(
                "Total number of items purchased: %d%n",
                peachesQty + beansQty + chickenQty + socksQty + waterQty);
        System.out.printf(
                "Your weekly shop cost:  %.2f",
                peachesQty * peachesPrice
                        + beansQty * beansPrice
                        + chickenQty * chickenPrice
                        + socksQty * socksPrice
                        + waterQty * waterPrice);
    }
}
