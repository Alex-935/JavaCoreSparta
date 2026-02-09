package com.sparta.gameprs;

public class Scissors implements Gesture {
    @Override
    public Result playsRock() {
        return Result.LOSE;
    }

    @Override
    public Result playsPaper() {
        return Result.WIN;
    }

    @Override
    public Result playsScissors() {
        return Result.DRAW;
    }

    @Override
    public String toString() {
        return "Scissors";
    }
}
