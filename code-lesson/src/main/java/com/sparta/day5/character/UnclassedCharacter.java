package com.sparta.day5.character;

import java.util.Random;
import java.util.Scanner;

public class UnclassedCharacter {

    protected String className = "Unclassed";
    protected String[] attributeNames = new String[] {"strength", "intelligence", "wisdom", "dexterity", "constitution"};
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
    public boolean isPossibleToMeetStatRequirements() { return false; }

    protected int selectStatToLower(Scanner scanner) {

        System.out.printf("""
                    Please select a stat to lower:
                    1. Strength,
                    2. Intelligence,
                    3. Wisdom,
                    4. Dexterity,
                    5. Constitution.
                    """);

        do {
            try {
                // get int from user
                System.out.print("Please select one of the provided numbers: ");
                int num = Integer.parseInt(scanner.nextLine());

                // check it's between 1 and 5
                if (1 <= num && num <= 5) {
                    //  checks stat has a surplus
                    if (this.surplusArray[num-1] > 1) {
                        return num-1;
                    }
                    System.out.println("Please enter a number that has a big enough surplus.");
                }
                else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            }
            // catch error from converting user input to int
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            }
        } while (true);
    }

    protected int lowerStat(Scanner scanner, int attr) {

        do {
            try {
                // get int from user
                System.out.printf("How much do you want to lower %s by: ", this.attributeNames[attr]);
                int num = Integer.parseInt(scanner.nextLine());

                // checks the stat can be lowered by that much
                if (num % 2 == 1) {
                    System.out.println("You can only lower a stat by an even amount");
                }
                else if (num <= this.surplusArray[attr]) {
                    return num;
                }
                else {
                    System.out.println("You cannot lower that stat by that amount.");
                }
            }
            // catch error from converting user input to int
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            }
        } while (true);
    }

    protected int selectStatToRaise(Scanner scanner) {

        System.out.printf("""
                    Please select a stat to raise:
                    1. Strength,
                    2. Intelligence,
                    3. Wisdom,
                    4. Dexterity,
                    5. Constitution.
                    """);

        do {
            try {
                // get int from user
                System.out.print("Please select one of the provided numbers: ");
                int num = Integer.parseInt(scanner.nextLine());

                // check it's between 1 and 5
                if (1 <= num && num <= 5) {
                    //  checks stat has a surplus
                    if (this.deficitArray[num-1] != 0) {
                        return num-1;
                    }
                    System.out.println("You do not need to raise that stat.");
                }
                else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            }
            // catch error from converting user input to int
            catch (NumberFormatException e) {
                System.out.println("Please enter an integer.");
            }
        } while (true);
    }

    public void updateAttributes(int raiseAttr, int lowerAttr, int amount) {

        this.surplusArray[lowerAttr] -= amount;
        this.attributesArray[lowerAttr] -= amount;
        this.deficitArray[raiseAttr] += amount/2;
        this.attributesArray[raiseAttr] += amount/2;
    }

}
