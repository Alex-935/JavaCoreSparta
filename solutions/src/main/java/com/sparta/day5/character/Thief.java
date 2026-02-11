package com.sparta.day5.character;

import java.util.List;
import java.util.Map;

public class Thief extends Character {
    public Thief() {
        requiredStats.putAll(Map.of(
                "Strength", 10,
                "Intelligence", 9,
                "Dexterity", 15
        ));
        coreStatIndex.addAll(List.of(0, 1, 3));
    }

    @Override
    public void generate() {
        stats.addAll(
                List.of(
                        new Stat("Strength", random.nextInt(16) + 3, requiredStats.get("Strength")),
                        new Stat("Intelligence", random.nextInt(16) + 3, requiredStats.get("Intelligence")),
                        new Stat("Wisdom", random.nextInt(16) + 3),
                        new Stat("Dexterity", random.nextInt(16) + 3, requiredStats.get("Dexterity")),
                        new Stat("Constitution", random.nextInt(16) + 3)
                )
        );
    }

    @Override
    public String toString() {
        return "Thief";
    }
}
