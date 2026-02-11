package com.sparta.day5.vowelescape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelApp {
    static void main() {
        String input = "";
        List<Character> vowels = new ArrayList<>(List.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a your text: ");
        input = scanner.nextLine().trim();

        StringBuilder upper = new StringBuilder();
        StringBuilder removed = new StringBuilder();

        for (char letter : input.toCharArray()) {
            if (vowels.contains(letter)) {
                upper.append(Character.toUpperCase(letter));
            } else {
                upper.append(letter);
                removed.append(letter);
            }
        }

        System.out.println(upper);
        System.out.println(removed);
    }
}
