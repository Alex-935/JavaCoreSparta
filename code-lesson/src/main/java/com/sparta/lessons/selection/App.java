package com.sparta.lessons.selection;

public class App {

    public static void main(String[] args) {

        int mark = 35;
        System.out.println(getGrade(mark));

        System.out.println(priority(3));

        System.out.println(enhancedPriority(-1));
    }

    public static String getGrade(int mark) {

        /*
        if (mark >= 85) {
            return "Distinction";
        }
        else if (mark >= 40) {
            return "Pass";
        }
        return "fail";
        */

        // nested ternary operators
        return (mark >= 85) ? "Distinction" : ((mark >= 65) ? "Pass" : "Fail");
    }

    public static String priority(int level) {

        String priority = "Code ";
        switch (level) {
            case 3:
                priority += "Red";
                break;
            case 2:
            case 1:
                priority += "Yellow";
                break;
            case 0:
                priority += "Green";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }

    public static String enhancedPriority(int level) {

        String priority = "Code ";
        switch (level) {
            case 3 -> priority += "Red";
            case 2, 1 -> priority += "Yellow";
            case 0 -> priority += "Green";
            default -> priority = "Error";
        }
        return priority;
    }
}
