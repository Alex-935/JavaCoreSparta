package com.sparta.day5.vowelescape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelApp {

    //attributes
    private Scanner scanner;
    private StringBuilder vowels;
    private StringBuilder voweless;
    private List<String> vowelsList;
    private String userString;
    private String upperCaseVowelsString;
    private String vowelsRemovedString;
    private String[] returnStrings;

    VowelApp() {

        // initial setup
        this.scanner = new Scanner(System.in);
        this.vowels = new StringBuilder();
        this.voweless = new StringBuilder();
        this.vowelsList = new ArrayList<>(Arrays.asList("A", "E", "I", "O", "U"));

        //get user input and separate strings
        setUserString();
        extractVowels();

        // build final strings
        this.upperCaseVowelsString = vowels.toString();
        this.vowelsRemovedString = voweless.toString();

        // return two strings
        this.returnStrings = new String[] {this.upperCaseVowelsString, this.vowelsRemovedString};
    }

    // vowel list getter
    public String getVowelList() {
        return this.upperCaseVowelsString;
    }

    // gets the input string from the user
    public void setUserString() {
        System.out.print("Please enter your string: ");
        this.userString = scanner.nextLine();
    }

    // separates the vowels and consonants into stringBuilders
    public void extractVowels() {

        for (int i = 0; i < this.userString.length(); i++) {

            String currChar = String.valueOf(this.userString.charAt(i)).toUpperCase();

            if (this.vowelsList.contains(currChar)) {
                vowels.append(currChar);
            }
            else {
                voweless.append(this.userString.charAt(i));
            }
        }
    }

    // getter for the two strings as a list.
    public String[] getSeperatedStrings() {
        return this.returnStrings;
    }
}
