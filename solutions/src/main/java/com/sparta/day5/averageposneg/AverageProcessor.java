package com.sparta.day5.averageposneg;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AverageProcessor {
    private final List<Integer> posValues = new ArrayList<>();
    private final List<Integer> negValues = new ArrayList<>();

    public AverageProcessor(int[] inputValues) {
        for (int num: inputValues) {
            if (num != 0) {
                if (num > 0) {
                    posValues.add(num);
                } else {
                    negValues.add(num);
                }
            }
        }
    }

    public String getPositiveNumberResults() {
        return getResult(posValues, "positive");
    }

    public String getNegativeNumberResults() {
        return getResult(negValues, "negative");
    }

    private String getResult(List<Integer> values, String sign) {
        if (values.isEmpty()) return "There were no " + sign + " numbers.";
        return String.format(
                "The sum of the " + sign + " integers: %d%nThe average of the " + sign + " integers: %s",
                values.stream().mapToInt(Integer::intValue).sum(),
                values.stream().mapToInt(Integer::intValue).average().orElse(0.0));
    }
}
