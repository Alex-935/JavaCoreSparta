package com.sparta.day7.destroyer;

public class Game {
    private Cell[][] grid = new Cell[5][5];
    private Destroyer destroyer;
    private CellState lastStateChange;

    public Game(Destroyer destroyer) {
        this.destroyer = destroyer;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                Cell cell = new Cell();
                if (destroyer.isHere(x, y)) {
                    cell.setState(CellState.DESTROYER);
                }
                grid[x][y] = cell;
            }
        }
    }

    public String renderGrid() {
        StringBuilder grid = new StringBuilder();
        grid.append(String.format("  %4s%4s%4s%4s%4s%n", "0 ", "1 ", "2 ", "3", "4"));
        for (int x = 0; x < 5; x++) {
            grid.append(String.format("%d ", x));
            for (int y = 0; y < 5; y++) {
                grid.append(this.grid[x][y].getDisplayState());
            }
            grid.append("\n");
        }
        return grid.toString();
    }

    public boolean shoot(Coords coords) {
        CellState thisCellState = grid[coords.getX()][coords.getY()].getState();
        switch (thisCellState) {
            case CellState.CLEAR -> {
                grid[coords.getX()][coords.getY()].setState(CellState.MISS);
                lastStateChange = CellState.MISS;
                return false;
            }
            case CellState.DESTROYER -> {
                grid[coords.getX()][coords.getY()].setState(CellState.HIT);
                lastStateChange = CellState.HIT;
                destroyer.hit();
                return false;
            }
        }
        return true;
    }

    public String getLastShotResult() {
        if (!destroyer.isOperational()) {
            return "Glug, glug, glug...you won";
        }
        if (lastStateChange == CellState.HIT) {
            return "Well done, you hit!\n";
        }
        return "Sorry, you missed\n";
    }
}
