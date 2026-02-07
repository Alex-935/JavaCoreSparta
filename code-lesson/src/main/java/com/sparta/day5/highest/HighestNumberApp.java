package com.sparta.day5.highest;

import java.util.List;

public class HighestNumberApp {

    // initialise variables
    private int highest;
    private int secondHighest;
    private List<Integer> numbersList;

    HighestNumberApp(List<Integer> numbersList) {

        // set list to be list from argument
        this.numbersList = numbersList;
        // get the largest and second-largest numbers
        searchList();

    }

    // second-largest number getter
    public int getSecondHighestNumber() {
        return secondHighest;
    }

    // largest number getter
    public int getHighestNumber() {
        return highest;
    }

    // method that gets two largest numbers
    private void searchList() {

        // prevents error when assigning index 0
        if (this.numbersList.isEmpty()) {
            return;
        }

        // sets item at index 0 to highest
        this.highest = numbersList.getFirst();

        // for each number in the list
        for (Integer number : numbersList) {

            // if list entry is bigger than the largest number
            if (number > this.highest) {
                this.secondHighest = this.highest;
                this.highest = number;
            }
            // possible for an entry to be larger than second largest,
            // but less than largest
            else if (number > this.secondHighest) {
                this.secondHighest = number;
            }
        }
    }
}
