package com.sparta.day4.highlow;

import java.util.*;

public class HighLowApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Map<String, Integer> cards = new HashMap<>();
        cards.putAll(Map.of(
                "Ace", 1,
                "Jack", 11,
                "Queen", 12,
                "King", 13
        ));
        for (int i = 2; i <= 10; i++) {
            cards.put(Integer.toString(i), i);
        }

        ArrayList<String> faces = new ArrayList<>(cards.keySet());

        String originalCardFace = faces.get(random.nextInt(13));
        int originalValue = cards.get(originalCardFace);
        
        System.out.printf("Dealer's card is %s, higher or lower? ", originalCardFace);
        String guess = scanner.nextLine();

        String nextCardFace = faces.get(random.nextInt(13));
        int nextValue = cards.get(nextCardFace);
        
        String result = String.format("You lose! %s is not %s than %s!", nextCardFace, guess, originalCardFace);
        
        if (guess.equalsIgnoreCase("higher") && originalValue < nextValue) {
               result = String.format("Congratulations, %s is higher than %s. You won!", nextCardFace, originalCardFace);
        }
        if (guess.equalsIgnoreCase("lower") && originalValue > nextValue) {
                result = String.format("Congratulations, %s is lower than %s. You won!", nextCardFace, originalCardFace);
        }
        System.out.println(result);
    }
}
