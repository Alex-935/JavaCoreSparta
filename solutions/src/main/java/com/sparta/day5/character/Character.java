package com.sparta.day5.character;

import java.util.*;

public abstract class Character {
    protected final Random random = new Random();
    protected List<Stat> stats = new ArrayList<>();
    protected Map<String, Integer> requiredStats = new HashMap<>();
    protected List<Integer> coreStatIndex = new ArrayList<>();

    public boolean isNotViable() {
        int surplus = getTotalAvailable();
        int deficit = getAdjustedDeficit();
        return surplus < deficit;
    }

    public String displayableStats() {
        StringBuilder statsString = new StringBuilder();
        statsString.append(String.format("%s%n", this));
        for (Stat stat: stats) {
            statsString.append(String.format("%s: %d%n", stat.getName(), stat.getPoints()));
        }
        return statsString.toString();
    }

    public boolean isCreatableNow() {
        return stats.get(coreStatIndex.get(0)).hasEnough() &&
                stats.get(coreStatIndex.get(1)).hasEnough() &&
                stats.get(coreStatIndex.get(2)).hasEnough();
    };

    public abstract void generate();

    protected int getTotalAvailable() {
        return stats.stream().mapToInt(Stat::getAvailable).sum();
    }

    protected int getAdjustedDeficit() {
        return stats.get(coreStatIndex.get(0)).getDeficit()
                + stats.get(coreStatIndex.get(1)).getDeficit()
                + stats.get(coreStatIndex.get(2)).getDeficit();
    }

    public void convert(int statToReduce, int statToIncrease, int points) {
        int fromStat = statToReduce - 1;
        int toStat = statToIncrease - 1;

        if (!coreStatIndex.contains(toStat))
            throw new IllegalArgumentException(String.format("%s is not core for a %s", stats.get(toStat).getName(), this));

        if (stats.get(fromStat).canReduceBy(points)) {
            stats.get(toStat).add(stats.get(fromStat).takePoints(points));
        }

        if (this.isNotViable()) {
            throw new IllegalArgumentException(String.format("The %s character is no longer viable", this));
        }
    }
}
