package com.sparta.day5.characterrefactored;

public class Wizard extends UnclassedCharacter implements AdvancedClass {

    Wizard(int[] attributesArray) {

        this.className = "Wizard";
        this.attributesArray = attributesArray;
        this.setRequirements();
        this.deficitArray = calculateDeficit();
        this.surplusArray = calculateSurplus();
    }

    @Override
    public void setRequirements() {
        this.requirementsArray = new int[] {0, 15, 10, 10, 0};
    }

}
