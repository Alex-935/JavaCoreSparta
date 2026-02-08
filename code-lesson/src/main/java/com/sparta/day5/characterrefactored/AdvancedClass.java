package com.sparta.day5.characterrefactored;

public interface AdvancedClass {

    void setRequirements();

    // Everything else is in the superclass
    void setMinStatTotal();
    //boolean meetMinStats();
    void fullAttributeTable();
    int[] calculateDeficit();
    int[] calculateSurplus();
    void updateDeficitAndSurplus();
    boolean isRequirementsMet();
    boolean isPossibleToMeetStatRequirements();
}
