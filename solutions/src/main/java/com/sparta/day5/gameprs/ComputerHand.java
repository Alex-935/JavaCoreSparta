package com.sparta.day5.gameprs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerHand {
    private Gesture gesture;
    private List<Gesture> computerChoice;
    private static final Random RND = new Random();

    public ComputerHand() {
        computerChoice = new ArrayList<>(List.of(
                new Rock(), new Paper(), new Scissors()
        ));
        changeGesture();
    }

    public Result play(String userHand) {
        changeGesture();
        return switch (userHand.toLowerCase()) {
            case "rock" -> gesture.playsRock();
            case "paper" -> gesture.playsPaper();
            case "scissors" -> gesture.playsScissors();
            default -> null;
        };
    }

    @Override
    public String toString() {
        return gesture.toString();
    }

    private void changeGesture() {
        gesture = computerChoice.get(RND.nextInt(3));
    }
}
