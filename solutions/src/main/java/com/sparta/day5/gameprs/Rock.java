package com.sparta.day5.gameprs;

public class Rock implements Gesture {
    @Override
    public Result playsRock() {
        return Result.DRAW;
    }

    @Override
    public Result playsPaper() {
        return Result.LOSE;
    }

    @Override
    public Result playsScissors() {
        return Result.WIN;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
