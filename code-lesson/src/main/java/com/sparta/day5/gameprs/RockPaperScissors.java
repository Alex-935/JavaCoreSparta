package com.sparta.day5.gameprs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {

    // define attributes
    private int bestOf;
    private ArrayList<String> choicesArray;
    private String userChoice;
    private String compChoice;
    private int userWins = 0;
    private int compWins = 0;
    private Scanner scanner;
    private Random random;

    // constructor
    RockPaperScissors(int bestOf) {

        // give attributes values
        this.bestOf = bestOf;
        this.choicesArray = new ArrayList<>(Arrays.asList("rock", "paper", "scissors", "r", "p", "s"));
        this.scanner = new Scanner(System.in);
        this.random = new Random();

        while (this.userWins < bestOf && this.compWins < bestOf) {
            gameLoop();
        }
        finalOutput();
    }

    // main game loop
    void gameLoop() {

        // get player choices
        getUserChoice();
        reformatUserInput();
        getCompChoice();
        if (!isTie()){
            printResult(isUserWin());
        }
    }

    void getUserChoice() {

        do{
            System.out.print("Please enter your choice using the word or initial: ");
            this.userChoice = this.scanner.nextLine().toLowerCase();

            if (this.choicesArray.contains(this.userChoice)) {
                break;
            }

            System.out.println("Please enter rock, paper or scissors.");
        } while (true);
    }

    void reformatUserInput() {
        if (this.userChoice.equals("r")) {
            this.userChoice = "rock";
        }
        else if (this.userChoice.equals("s")) {
            this.userChoice = "scissors";
        }
        else if (this.userChoice.equals("p")) {
            this.userChoice = "paper";
        }
    }

    void getCompChoice() {
        this.compChoice = this.choicesArray.get(this.random.nextInt(3));
    }

    boolean isTie() {
        return this.userChoice.equals(this.compChoice);
    }

    boolean isUserWin() {

        if (this.userChoice.equals("rock") && this.compChoice.equals("scissors")) {
            this.userWins++;
            return true;
        }
        else if (this.userChoice.equals("scissors") && this.compChoice.equals("paper")) {
            this.userWins++;
            return true;
        }
        else if (this.userChoice.equals("paper") && this.compChoice.equals("rock")) {
            this.userWins++;
            return true;
        }
        this.compWins++;
        return false;
    }

    void printResult(boolean userWin) {
        System.out.printf("""
                %nYou chose: %s,
                The computer chose: %s,
                %s
                The score is currently:
                User: %d,
                Computer: %d%n
                """, this.userChoice, this.compChoice,
                (userWin) ? "You Win!" : "You Lose!",
                this.userWins, this.compWins);

    }


    public void finalOutput() {
        System.out.printf("The final score is:" +
                " %nYou: " + this.userWins +
                " %nComputer: " + this.compWins + "%n" +
                ((this.userWins == 3) ? "Congratulations, you win!" : "Unfortunately you lost, Better luck next time%n"));
    }
}
