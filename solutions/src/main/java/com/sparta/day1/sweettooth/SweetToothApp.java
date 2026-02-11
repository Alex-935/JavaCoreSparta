package com.sparta.day1.sweettooth;

public class SweetToothApp {
    static void main() {
        int sweetQuantity = 40;
        int numberOfStudents = 14;

        System.out.printf("Number of sweets per child: %d%n", sweetQuantity / 14);
        System.out.printf("Sweets for the teacher: %d", sweetQuantity % 14);
    }
}
