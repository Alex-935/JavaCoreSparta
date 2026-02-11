package com.sparta.day5.gameprs;

public class Paper implements Gesture {
    @Override
    public Result playsRock() {
        return Result.WIN;
    }

    @Override
    public Result playsPaper() {
        return Result.DRAW;
    }

    @Override
    public Result playsScissors() {
        return Result.LOSE;
    }

    @Override
    public String toString() {
        return "Paper";
    }
}
