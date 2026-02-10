package com.sparta.lessons.enums;

public class App {

    /*
    // static and final makes it a true constant
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;
     */

    // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

    public static void main(String[] args) {

        Day dayOfTheWeek = Day.FRIDAY;

        if (dayOfTheWeek == Day.SATURDAY || dayOfTheWeek == Day.SUNDAY) {

            System.out.println("It's the weekend");
        }

        else {
            System.out.println("It's a weekday");
        }

        System.out.println(Day.values().toString());

    }
}
