package com.sparta.day5.vowelescape;

public class App {

    public static  void main(String[] args) {

        VowelApp vowelessOne = new VowelApp();

        String[] seperatedStrings = vowelessOne.getSeperatedStrings();

        System.out.printf("Vowel List: %s%nConsonant List: %s%n",
                seperatedStrings[0], seperatedStrings[1]);
    }
}
