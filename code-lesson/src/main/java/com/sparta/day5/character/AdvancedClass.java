package com.sparta.day5.character;

public interface AdvancedClass {

    void setRequirements();
    void setMinStatTotal();
    //boolean meetMinStats();

    void fullAttributeTable();
    int[] calculateDeficit();
    int[] calculateSurplus();
    void updateDeficitAndSurplus();
    boolean isRequirementsMet();
    boolean isPossibleToMeetStatRequirements();
}
