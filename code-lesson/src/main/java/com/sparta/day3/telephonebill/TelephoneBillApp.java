package com.sparta.day3.telephonebill;

import java.util.Scanner;

public class TelephoneBillApp {

    public static void main(String[] args) {

        Scanner scanner  =  new Scanner(System.in);

        /*
        final double CALL_VALUE = 0.15;
        final double VAT_RATE = 0.2;
         */

        System.out.print("Please enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Calculate cost
        // 100 needs to be a float in order to do float division
        float cost = (15*minutes) / 100.0f;

        // Vat = 20%
        float vat = cost * 0.2f;

        // Calculate total
        float total = cost + vat;

        System.out.printf("""
                Basic call charge: $%.2f
                VAT due: $%.2f
                Total bill: $%.2f
                """, cost, vat, total);
    }
}
