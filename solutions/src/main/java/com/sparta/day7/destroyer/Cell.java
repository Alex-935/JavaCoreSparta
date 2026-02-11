package com.sparta.day7.destroyer;

public class Cell {
    private CellState state = CellState.CLEAR;

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public String getDisplayState() {
        return switch(state) {
            case CellState.HIT -> "[💥]";
            case CellState.MISS -> "[💦]";
            default -> "[⬜]";
        };
    }
}
