package com.sparta.day5.characterrefactored;

public class Thief extends UnclassedCharacter implements AdvancedClass {

    Thief(int[] attributesArray) {

        this.className = "Thief";
        this.attributesArray = attributesArray;
        this.setRequirements();
        this.deficitArray = calculateDeficit();
        this.surplusArray = calculateSurplus();
    }

    @Override
    public void setRequirements() {
        this.requirementsArray = new int[] {10, 9, 0, 15, 0};
    }

}
