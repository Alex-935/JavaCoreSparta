package com.sparta.calculator;

public class Calculator {
    private final int num1;
    private final int num2;
    private final String operator;

    public Calculator(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator.trim();
    }

    public double getResult() {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "/" -> (double)num1 / num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
