package com.sparta.day5.character;

import java.util.List;
import java.util.Map;

public class Wizard extends Character {

    public Wizard() {
        requiredStats.putAll(Map.of(
                "Intelligence", 15,
                "Wisdom", 10,
                "Dexterity", 10
        ));
        coreStatIndex.addAll(List.of(1, 2, 3));
    }

    @Override
    public void generate() {
        stats.addAll(
                List.of(
                        new Stat("Strength", random.nextInt(16) + 3),
                        new Stat("Intelligence", random.nextInt(16) + 3, requiredStats.get("Intelligence")),
                        new Stat("Wisdom", random.nextInt(16) + 3, requiredStats.get("Wisdom")),
                        new Stat("Dexterity", random.nextInt(16) + 3, requiredStats.get("Dexterity")),
                        new Stat("Constitution", random.nextInt(16) + 3)
                )
        );
    }

    @Override
    public String toString() {
        return "Wizard";
    }}
