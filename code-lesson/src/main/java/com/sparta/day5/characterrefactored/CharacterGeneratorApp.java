package com.sparta.day5.characterrefactored;

import java.util.Scanner;

public class CharacterGeneratorApp {

    CharacterGeneratorApp(Scanner scanner) {

        // initialise characters stats and choose advanced class
        UnclassedCharacter playerCharacter = new UnclassedCharacter();
        //playerCharacter.printInitialGreeting();
        playerCharacter.chosenAdvancedClass = playerCharacter.chooseClass(scanner);

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

        playerCharacter.updateDeficitAndSurplus();
        if (!playerCharacter.isPossibleToMeetStatRequirements()) {
            System.out.println("Sorry, there is no way for you to meet the stat requirements");
            System.out.println("You will have to start the program over!");
        }
        else {

            while (!playerCharacter.isRequirementsMet()) {

                // user update stats
                int attrToLower = playerCharacter.selectStatToLower(scanner);
                int lowerBy = playerCharacter.lowerStat(scanner, attrToLower);
                playerCharacter.fullAttributeTable();
                int attrToRaise = playerCharacter.selectStatToRaise(scanner);
                playerCharacter.updateAttributes(attrToRaise, attrToLower, lowerBy);

                // update surplus and deficit
                playerCharacter.updateDeficitAndSurplus();

                //print out stats again
                System.out.println("Your attributes are now:");
                playerCharacter.fullAttributeTable();

                if (playerCharacter.currentDeficit > 0) {
                    System.out.println("Your still need to update attributes to meet the requirements!");
                }

                if (!playerCharacter.isPossibleToMeetStatRequirements()) {
                    System.out.println("Sorry, there is now no way for you to meet the stat requirements");
                    System.out.println("You will have to start the program over!");
                }
            }

            System.out.println("Congratulations, you are now a " + playerCharacter.className);
        }
    }
}
