package com.sparta.day3.telephonebill;

import java.util.Scanner;

public class TelephoneBillApp {
    static void main() {
        final double VAT = 0.2;
        final int CALL_RATE = 15;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        int billedMinutes = scanner.nextInt();

        double callCharge = (billedMinutes * CALL_RATE) / 100.00;
        double vatDue = callCharge * VAT;
        double totalBill = callCharge + vatDue;

        System.out.printf("Basic call charge: £%.2f%n", callCharge);
        System.out.printf("VAT due: £%.2f%n", vatDue);
        System.out.printf("Total bill: £%.2f", totalBill);
    }
}
