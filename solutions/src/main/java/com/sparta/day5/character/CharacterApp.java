package com.sparta.day5.character;

import java.util.List;
import java.util.Scanner;

public class CharacterApp {
    private static final Scanner scanner = new Scanner(System.in);

    static void main() {
        Character character = userCharacterSelection();
        character.generate();

        if (character.isCreatableNow()) {
            successfulCharacterCreation(character);
            return;
        }

        if (character.isNotViable()) {
            System.out.println("You do not have enough stats for a viable " + character);
            return;
        }
        System.out.println(character.displayableStats());
        System.out.println("You could generate your character with adjustments");

        try {
            while (!character.isCreatableNow()) {
                adjustStat(character);
                System.out.println(character.displayableStats());
            }
            System.out.println("Congratulations, you have successfully created your " + character);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void adjustStat(Character character) {
        System.out.print("Which stat would you like to take from? ");
        int statToReduce = scanner.nextInt();
        scanner.nextLine();

        System.out.print("How many points would you like to take? ");
        int points = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Which stat would you like to contribute to? ");
        int statToIncrease = scanner.nextInt();
        scanner.nextLine();

        character.convert(statToReduce, statToIncrease, points);
    }

    private static void successfulCharacterCreation(Character character) {
        System.out.println("Congratulations, you have created the following");
        System.out.println(character.displayableStats());
    }

    private static void printChar(List<Stat> stats) {
        for (Stat stat: stats) {
            System.out.printf("%s: %d%n", stat.getName(), stat.getPoints());
        }
    }

    private static Character userCharacterSelection() {
        System.out.print("""
                                 Select your character:
                                 1. Warrior
                                 2. Wizard
                                 3. Thief
                                 4. Necromancer
                                 """);
        int selection = scanner.nextInt();
        scanner.nextLine();

        return switch (selection) {
            case 1 -> new Warrior();
            case 2 -> new Wizard();
            case 3 -> new Thief();
            case 4 -> new Necromancer();
            default -> null;
        };
    }
}
