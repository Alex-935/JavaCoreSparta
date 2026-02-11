package com.sparta.day7.destroyer;

import java.util.Random;

public class Destroyer {
    private Coords cell1;
    private Coords cell2;
    private int strike;

    public Destroyer(Random random) {
        cell1 = new Coords(
                random.nextInt(5),
                random.nextInt(5));
        do {
            cell2 = getSecondCell(random);
        } while (cell1.equals(cell2));
    }

    public Coords getCell1() {
        return cell1;
    }

    public Coords getCell2() {
        return cell2;
    }

    public boolean isHere(int x, int y) {
        return cell1.coordsMatch(x, y) || cell2.coordsMatch(x, y);
    }

    private Coords getSecondCell(Random random) {
        int origin, bound;
        int x, y;
        x = getAnchoredRandomCoord(random, cell1.getX());
        if (x != cell1.getX()) {
            return new Coords(x, cell1.getY());
        }
        do {
            y = getAnchoredRandomCoord(random, cell1.getY());
        } while (cell1.coordsMatch(cell1.getX(), y));
        return new Coords(cell1.getX(), y);
    }

    private static int getAnchoredRandomCoord(Random random, int anchorCoord) {
        return switch (anchorCoord) {
            case 4 -> random.nextInt(3, 5);
            case 0 -> random.nextInt(0, 2);
            default -> random.nextInt(anchorCoord - 1, anchorCoord + 2);
        };
    }

    public void hit() {
        strike++;
    }

    public boolean isOperational() {
        return strike < 2;
    }
}

