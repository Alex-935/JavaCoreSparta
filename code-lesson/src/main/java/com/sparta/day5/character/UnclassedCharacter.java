package com.sparta.day5.character;

import java.util.Random;
import java.util.Scanner;

public class UnclassedCharacter {

    protected String className = "Unclassed";
    protected int[] attributesArray = new int[5];// the stats your character has
    protected int[] requirementsArray;
    protected int minStatTotal;
    protected String chosenAdvancedClass;
    protected int currentDeficit;
    protected int[] deficitArray = new int[5];
    protected int currentSurplus;
    protected int[] surplusArray = new int[5];

    UnclassedCharacter() {

        setAttributes();

    }


    // getters
    public String getClassName() {
        return this.className;
    }

    public int[] getAttributes() {
        return this.attributesArray;
    }

    public int[] getRequirements() {
        return this.requirementsArray;
    }

    public int getMinStatTotal() {
        return minStatTotal;
    }



    // sets the initial stats
    protected void setAttributes() {

        Random generateStat = new Random();

        for (int i = 0; i < this.attributesArray.length; i++) {

            this.attributesArray[i] = generateStat.nextInt(3, 19);
        }
    }

    // print stat totals
    protected void printInitialGreeting() {
        System.out.printf("""
                Welcome adventurer, I have been awaiting you.
                Unfortunately, you did not survive your last encounter with that truck.
                But brave hero, I must now kindly aks you save another world from the most terrifyingly wicked Demon Lord!
                First lets examine your stats, they are as follows:
                """);
        printAttributes();
    }

    protected void printAttributes() {
        System.out.printf("""
                Strength: %d,
                Intelligence: %d,
                Wisdom: %d,
                Dexterity: %d,
                Constitution: %d.
                """, this.attributesArray[0], this.attributesArray[1],
                this.attributesArray[2], this.attributesArray[3], this.attributesArray[4]);
    }

    protected String chooseClass(Scanner scanner) {
        System.out.printf("""
                
                Brave hero, there are 4 classes available to you:
                1. The formidable front-liner: Warrior,
                2. The arcane alchemist: Wizard,
                3. The sadistic sneak: Thief,
                4. The morbid malfeasance: Necromancer.
                
                Which class would you like to be:
                """);

        return getValidClass(scanner);
    }

    protected String getValidClass(Scanner scanner) {

        do {
            System.out.print("Enter the number next to the class you want: ");
            String userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1":
                    return "Warrior";
                case "2":
                    return "Wizard";
                case "3":
                    return "Thief";
                case "4":
                    return "Necromancer";
                default:
            }

        } while (true);
    }

    public void fullAttributeTable() {}
    public boolean isRequirementsMet() { return false; }
    public void updateDeficitAndSurplus() {}
    public boolean isPossibleToMeetStatRequirements() {
        System.out.println("Wrong One");
        return false; }

}
