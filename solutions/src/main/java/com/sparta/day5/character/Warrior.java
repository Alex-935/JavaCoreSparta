package com.sparta.day5.character;

import java.util.List;
import java.util.Map;

public class Warrior extends Character {

    public Warrior() {
        requiredStats.putAll(Map.of(
                "Strength", 15,
                "Dexterity", 12,
                "Constitution", 10
        ));
        coreStatIndex.addAll(List.of(0, 3, 4));
    }

    @Override
    public void generate() {
        stats.addAll(
                List.of(
                        new Stat("Strength", random.nextInt(16) + 3, requiredStats.get("Strength")),
                        new Stat("Intelligence", random.nextInt(16) + 3),
                        new Stat("Wisdom", random.nextInt(16) + 3),
                        new Stat("Dexterity", random.nextInt(16) + 3, requiredStats.get("Dexterity")),
                        new Stat("Constitution", random.nextInt(16) + 3, requiredStats.get("Constitution"))
                )
        );
    }

    @Override
    public String toString() {
        return "Warrior";
    }
}
