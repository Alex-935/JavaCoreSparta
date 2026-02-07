package com.sparta.lessons.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        var now = LocalDate.now();
        var nextWeek = now.plusWeeks(1);
        var anotherDate = now.withDayOfMonth(5).withYear(2026);
        if (anotherDate.getMonth().equals(nextWeek.getMonth())) {
            System.out.println("The dates are in the same month");
        }
        else {
            System.out.println("The dates are in different months");
        }

        // If the user enters a date, you need to make sure it is the same format you are expecting
        // All of DateTimeFormatter's methods are static, so we don't need new as that creates an instance/object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        var myDate = LocalDate.parse("09-11-2001", formatter);
        System.out.println(myDate.toString());

        DateTimeFormatter altFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d LLLL, yyyy");
        var secondDate = LocalDate.parse("09-03-2001", altFormatter);
        System.out.println(secondDate.format(outputFormatter));
    }
}
