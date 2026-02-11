package com.sparta.day5.highest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighestNumberApp {
    static void main() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 12, 7, 19, 3, 42, 8, 16, 27, 33,
                4, 9, 21, 11, 6, 25, 14, 2, 18, 30
        ));
        System.out.println(getsecondHighest(numbers));
    }

    private static int getsecondHighest(List<Integer> numbers) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int number: numbers) {
            if (number > highest) {
                secondHighest = highest;
                highest = number;
            } else {
                if (number > secondHighest) {
                    secondHighest = number;
                }
            }
        }
        return secondHighest;
    }
}
