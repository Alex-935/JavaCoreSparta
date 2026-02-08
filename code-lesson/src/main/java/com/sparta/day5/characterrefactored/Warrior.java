package com.sparta.day5.characterrefactored;

public class Warrior extends UnclassedCharacter implements AdvancedClass {

    Warrior(int[] attributesArray) {

        this.className = "Warrior";
        this.attributesArray = attributesArray;
        this.setRequirements();
        this.deficitArray = calculateDeficit();
        this.surplusArray = calculateSurplus();


    }

    @Override
    public void setRequirements() {
        this.requirementsArray = new int[] {15, 0, 0, 12, 10};
    }

}
