package com.sparta.day5.character;

public class Stat {
    private final String name;
    private int points;
    private final int requiredPoints;

    public Stat(String name, int points, int requiredPoints) {
        this.name = name;
        this.points = points;
        this.requiredPoints = requiredPoints;
    }

    public Stat(String name, int points) {
        this(name, points, 3);
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int takePoints(int points) {
        points = makeEven(points);
        if (this.points - points >= requiredPoints) {
            this.points -= points;
            return points / 2;
        }
        return 0;
    }

    public int getAvailable() {
        int rawPoints = this.points - requiredPoints;
        if (notEnoughToTransfer(rawPoints)) {
            return 0;
        }
        return rawPoints / 2;
    }

    private boolean notEnoughToTransfer(int rawPoints) {
        return rawPoints <= 1;
    }

    private int makeEven(int points) {
        points -= points % 2;
        return points;
    }

    public int getDeficit() {
        int deficit = points - requiredPoints;
        return deficit < 0 ? deficit * -1 : 0;
    }

    public boolean hasEnough() {
        return this.points >= requiredPoints;
    }

    public boolean canReduceBy(int points) {
        return points <= getAvailable() * 2;
    }

    public void add(int points) {
        this.points += points;
        this.points = Math.min(this.points, 18);
    }
}
