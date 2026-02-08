package com.sparta.lessons.arrays;

public class App {

    public static void main(String[] args) {

        arrays();
    }

    static void arrays() {

        /*
            Arrays are stored as one continuous memory slot in the heap
         */
        double weight1 = 9.4;
        double weight2 = 9.3;
        double weight3 = 9.5;

        double[] weights = new double[4];
        weights[0] = 9.4;
        weights[1] = 9.3;
        weights[2] = 9.5;
        weights[3] = 9.1;
        //weights[4] = 9.2;
        //double weightsPlus = new double[5]
        double[] moreWeights = {9.4, 9.5};

        System.out.println(weights[0]);

        weights[0] = 9.5;

        for (int i = 0; i < weights.length; i++) {
            System.out.println("Weight: " + weights[i]);
        }

        for (double weight : weights) {
            System.out.println(weight);
        }
    }

}
