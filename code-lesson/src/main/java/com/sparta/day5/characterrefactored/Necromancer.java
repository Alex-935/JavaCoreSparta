package com.sparta.day5.characterrefactored;

public class Necromancer extends UnclassedCharacter implements AdvancedClass {

    Necromancer(int[] attributesArray) {

        this.className = "Necromancer";
        this.attributesArray = attributesArray;
        this.setRequirements();
        this.deficitArray = calculateDeficit();
        this.surplusArray = calculateSurplus();
    }

    @Override
    public void setRequirements() {
        this.requirementsArray = new int[] {10, 10, 15, 0, 0};
    }

}
