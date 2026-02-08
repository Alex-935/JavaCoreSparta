package com.sparta.day5.character;

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

    @Override
    public void setMinStatTotal() {

        int statTotal = 0;
        for (int stat : this.requirementsArray) {
            statTotal += stat;
        }

        this.minStatTotal = statTotal;
    }

    @Override
    public int[] calculateDeficit() {

        int deficitTotal = 0;
        int[] deficit = new int[5];

        for (int i = 0; i < requirementsArray.length; i++) {

            int difference = this.attributesArray[i] - this.requirementsArray[i];
            deficit[i] = (difference < 0) ? difference : 0;

            deficitTotal += this.deficitArray[i];
        }
        this.currentDeficit = deficitTotal;
        return deficit;
    }

    @Override
    public int[] calculateSurplus() {

        int surplusTotal = 0;
        int[] surplus = new int[5];

        for (int i = 0; i < this.attributesArray.length; i++) {

            int additionalStats = (this.attributesArray[i] - this.requirementsArray[i]) -3;
            surplus[i] = (additionalStats > 0) ? additionalStats : 0;

            surplusTotal += (this.surplusArray[i] % 2 == 0) ? this.surplusArray[i] : this.surplusArray[i]-1;
        }
        this.currentSurplus = surplusTotal;
        return surplus;
    }


    @Override
    public void fullAttributeTable() {
        System.out.printf("""
                -----------------------------------------------------------------------------
                   Class:     Strength:  Intelligence:   Wisdom:    Dexteriy:   Constitution:
                -----------------------------------------------------------------------------
                Base Score  |    %2d     |     %2d     |     %2d     |     %2d     |     %2d     |
                %-11s |    %2d     |     %2d     |     %2d     |     %2d     |     %2d     |
                Deficit     |   %3d     |    %3d     |    %3d     |    %3d     |    %3d     |
                Surplus     |    %2d     |     %2d     |     %2d     |     %2d     |     %2d     |
                -----------------------------------------------------------------------------
                """,
                this.attributesArray[0], this.attributesArray[1], this.attributesArray[2], this.attributesArray[3], this.attributesArray[4],
                this.className, this.requirementsArray[0], this.requirementsArray[1], this.requirementsArray[2], this.requirementsArray[3], this.requirementsArray[4],
                this.deficitArray[0], this.deficitArray[1], this.deficitArray[2], this.deficitArray[3], this.deficitArray[4],
                this.surplusArray[0], this.surplusArray[1], this.surplusArray[2], this.surplusArray[3], this.surplusArray[4]
        );
    }


    @Override
    public boolean isRequirementsMet() {
        return (
                this.attributesArray[0] >= this.requirementsArray[0] &&
                        this.attributesArray[1] >= this.requirementsArray[1] &&
                        this.attributesArray[2] >= this.requirementsArray[2] &&
                        this.attributesArray[3] >= this.requirementsArray[3] &&
                        this.attributesArray[4] >= this.requirementsArray[4]
        );
    }


    @Override
    public void updateDeficitAndSurplus() {
        int usableSurplus = 0;
        int overallDefecit = 0;

        for (int i = 0 ; i < this.attributesArray.length; i++) {
            usableSurplus += (this.surplusArray[i] % 2 == 0) ? this.surplusArray[i] : this.surplusArray[i]-1;
            overallDefecit += this.deficitArray[i];
        }

        this.currentDeficit = overallDefecit;
        this.currentSurplus = usableSurplus;
    }


    @Override
    public boolean isPossibleToMeetStatRequirements() {

        // as two surplus points are needed for a deficit
        return this.currentSurplus+(this.currentDeficit * 2) > 0;
    }
}
