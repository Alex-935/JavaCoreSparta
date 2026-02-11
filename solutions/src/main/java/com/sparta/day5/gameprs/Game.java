package com.sparta.day5.gameprs;

public class Game {
    private final ComputerHand computerHand;
    private int computerScore;
    private int playerScore;

    public Game() {
        computerHand = new ComputerHand();
    }

    public String playRound(String playerGesture) {
        Result result = computerHand.play(playerGesture);
        if (result != null) {
            switch (result) {
                case Result.DRAW -> {
                    return resultString(playerGesture, "Draw");
                }
                case Result.WIN -> {
                    computerScore++;
                    return resultString(playerGesture, "You lose");
                }
                case Result.LOSE -> {
                    playerScore++;
                    return resultString(playerGesture, "You win");
                }
            }
        }
        return "Something went wrong, try again";
    }

    public boolean playOn() {
        return computerScore < 3 && playerScore < 3;
    }

    public String getResult() {
        return playOn() ? String.format("Computer: %d | You: %d", computerScore, playerScore)
                : getWinnersMessage();
    }

    private String getWinnersMessage() {
        return computerScore == 3 ? "Computer wins! 3 hands to " + playerScore
                : "You win! 3 hands to " + computerScore;
    }

    private String resultString(String playerGesture, String outcomeForPlayer) {
        return String.format("Computer: %s - You: %s -> %s!", computerHand.toString(), playerGesture, outcomeForPlayer);
    }
}
