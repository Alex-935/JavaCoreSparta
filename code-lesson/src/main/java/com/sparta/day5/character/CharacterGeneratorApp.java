package com.sparta.day5.character;

import java.util.Scanner;

public class CharacterGeneratorApp {

    CharacterGeneratorApp(Scanner scanner) {

        // initialise characters stats and choose advanced class
        UnclassedCharacter playerCharacter = new UnclassedCharacter();
        //playerCharacter.printInitialGreeting();
        playerCharacter.chosenAdvancedClass =  playerCharacter.chooseClass(scanner);

        // initialise advancedClass
        playerCharacter = switch (playerCharacter.chosenAdvancedClass) {
            case "Warrior" -> new Warrior(playerCharacter.attributesArray);
            case "Wizard" -> new Wizard(playerCharacter.attributesArray);
            case "Thief" -> new Thief(playerCharacter.attributesArray);
            case "Necromancer" -> new Necromancer(playerCharacter.attributesArray);
            default -> throw new RuntimeException("Invalid Advanced Class");
        };

        System.out.println("You will need to make sure you meet the minimum class requirements, this is how your current attributes compare:");
        playerCharacter.fullAttributeTable();

        if (!playerCharacter.isPossibleToMeetStatRequirements()) {
            System.out.println("Sorry, there is no way for you to meet the stat requirements");
            System.out.println("You will have to start the program over!");
        }

        /*
        while (!playerCharacter.isRequirementsMet()) {

            // user update stats

            // update surplus and deficit
            playerCharacter.updateDeficitAndSurplus();
        }*/
    }

}
