package com.sparta.day4.highlow;

import java.util.Random;
import java.util.Scanner;

public class HighLowApp {

    public static void main(String[] args) {

        gameLoop();
    }

    static void gameLoop() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // initialise game variables
        int currCard = dealCard(random), nextCard;
        boolean gameOver = false;
        int score = 0;

        while (!gameOver) {

            // get random next card
            nextCard = dealCard(random);

            // print out your card's value
            String cardValue = convertCard(currCard);
            System.out.printf("Your card is: %s%nDo you want to go higher or lower (Please enter 'h' or 'l')? ", cardValue);
            // process user's guess
            char guess = getGuess(scanner);
            System.out.printf("Higher or lower than a %s, it's a %s%n", cardValue, convertCard(nextCard));

            // if the card is lower and you guessed l or the card is higher and you guessed higher
            if (currCard > nextCard && guess == 'l' || currCard < nextCard && guess == 'h') {
                score++;
                currCard = nextCard;
                System.out.println("Congratulations, you guessed correctly. Your guess streak is: " + score);
            }
            else {
                System.out.println("Bad luck, you guessed wrong. Your guess streak was: " + score);
                System.out.print("Please enter 'y' to play again, or anything else to exit: ");

                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    score = 0;
                    currCard = dealCard(random);
                }
                else {
                    gameOver = true;
                    System.out.println("Thanks for playing.");
                }
            }
        }
    }

    static int dealCard(Random random) {
        return random.nextInt(1, 14);
    }

    static String convertCard(int card) {
        return switch (card) {
            case 1 -> "Ace";
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> String.valueOf(card);
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "";
        };
    }

    static char getGuess(Scanner scanner) {

        do {
            String userGuess = scanner.nextLine();
            if (userGuess.toLowerCase().equals("l")) {
                return 'l';
            }
            else if (userGuess.toLowerCase().equals("h")) {
                return 'h';
            }
            else {
                System.out.printf("Please enter 'h' or 'l': ");
            }
        } while (true);
    }
}
