package com.sparta.day5.highest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 12, 7, 19, 3, 42, 8, 16, 27, 33,
                4, 9, 21, 11, 6, 25, 14, 2, 18, 30
        ));

        HighestNumberApp secondHighestNumber = new HighestNumberApp(numbers);
        System.out.println("The highest number is: " + secondHighestNumber.getHighestNumber());
        System.out.println("The second highest number is: " + secondHighestNumber.getSecondHighestNumber());

    }
}
