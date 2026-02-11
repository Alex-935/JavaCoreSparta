package com.sparta.day7.destroyer;

import java.util.Random;
import java.util.Scanner;

public class DestroyerApp {

    // gameBoard
    private final int BOARDWIDTH = 5;
    private final int BOARDHEIGHT = 5;
    private String[][] gameBoard;

    // destroyer
    private int[] destroyerCoOrdinates;

    // game variables
   private boolean gameOver = false;
   private int[] userGuess = new int[2];
   private int hitCount = 0;


    DestroyerApp(Scanner scanner) {

        // initialise gameboard and fill with 'hidden' tiles
        this.gameBoard = new String[this.BOARDWIDTH][this.BOARDHEIGHT];
        buildBoard();

        // set destroyer location
        this.destroyerCoOrdinates = generateDestroyerLocation();
        //System.out.printf("co-ord 1: (%d, %d),  Co-ord 2: (%d, %d)%n", this.destroyerCoOrdinates[0], this.destroyerCoOrdinates[1], this.destroyerCoOrdinates[2], this.destroyerCoOrdinates[3]);

        // main gameLoop
        gameLoop(scanner);

    }

    private void buildBoard(){

        for (int r = 0; r < this.BOARDHEIGHT; r++) {
            for (int c = 0; c < this.BOARDWIDTH; c++) {
                this.gameBoard[r][c] = "⬜";
            }
        }
    }

    private int[] generateDestroyerLocation() {

        // define resource objects
        Random random = new Random();
        int[] coOrdinates = new int[4];

        //get the row co-ordinate
        coOrdinates[0] = random.nextInt(5);
        // get the column co-ordinate;
        coOrdinates[1] = random.nextInt(5);
        // get orientation, 0 for north, 1 for east, 2 for south, 3 for west;
        coOrdinates[2] = random.nextInt(4);

        // technically redundant as pass by reference
        coOrdinates = validateCoOrdinates(coOrdinates);
        return coOrdinates;
    }

    private int[] validateCoOrdinates(int[] coOrdinates) {

        // refactor co-ordinates so they're in the form [1x][1y][2x][2y];
        switch (coOrdinates[2]) {
            case 0:
                // north
                coOrdinates[2] = coOrdinates[0];
                coOrdinates[3] = coOrdinates[1] -1;
            case 1:
                // east
                coOrdinates[2] = coOrdinates[0] +1;
                coOrdinates[3] = coOrdinates[1];
            case 2:
                // south
                coOrdinates[2] = coOrdinates[0];
                coOrdinates[3] = coOrdinates[1] +1;
            case 3:
                // west
                coOrdinates[2] = coOrdinates[0] -1;
                coOrdinates[3] = coOrdinates[1];

            // check the second co-ordinates are valid
            for (int i = 2; i < 4; i++) {
                if (coOrdinates[i] > 4) {
                    // moves it to the other side of the destroyer
                    // e.g. if first co-ord [2][4] and direction is south:  [2][5] -> [2][3]
                    coOrdinates[i] -= 2;
                }
                else if (coOrdinates[i] < 0) {
                    coOrdinates[i] += 2;
                }
            }
        }

        // technically redundant as pass by reference but easier to test
        return coOrdinates;
    }


    // override toString to display gameboard
    @Override
    public String toString(){
        return String.format("""
                    0   1   2   3   4
                0 [%s][%s][%s][%s][%s]
                1 [%s][%s][%s][%s][%s]
                2 [%s][%s][%s][%s][%s]
                3 [%s][%s][%s][%s][%s]
                4 [%s][%s][%s][%s][%s]
                """,
                gameBoard[0][0], gameBoard[0][1], gameBoard[0][2], gameBoard[0][3], gameBoard[0][4],
                gameBoard[1][0], gameBoard[1][1], gameBoard[1][2], gameBoard[1][3], gameBoard[1][4],
                gameBoard[2][0], gameBoard[2][1], gameBoard[2][2], gameBoard[2][3], gameBoard[2][4],
                gameBoard[3][0], gameBoard[3][1], gameBoard[3][2], gameBoard[3][3], gameBoard[3][4],
                gameBoard[4][0], gameBoard[4][1], gameBoard[4][2], gameBoard[4][3], gameBoard[4][4]
                );
    }

    // main gameLoop where the game is played
    private void gameLoop(Scanner scanner) {

        // display game board
        System.out.println(toString());

        // until both destroyer co-ords have been hit
        while (this.hitCount != 2) {

            // get the user's guess from them
            getUserCoOrds(scanner);

            // update board to reflect that
            updateGameBoard();
        }

        // if they hit both destroyer pieces
        System.out.println("Glug, glug, glug.... you won!");
    }


    // keep asking for co-ordinates until the user inputs acceptable co-ordinates
    private void getUserCoOrds(Scanner scanner) {

        do {
            System.out.println("Please enter the co-ordinates in the form x,y: ");
            String[] userCoOrd = scanner.nextLine().split(",");

            // check the user has entered the right number of co-ords
            if (userCoOrd.length == 2) {
                this.userGuess[0] = convertCoOrdinate(userCoOrd[0]);
                this.userGuess[1] = convertCoOrdinate(userCoOrd[1]);

                if ((0 <= this.userGuess[0] && this.userGuess[0] < 5) &&
                (0 <= this.userGuess[1] && this.userGuess[1] < 5)) {
                    break;
                }
            }

        } while (true);
    }


    // converts user inputted co-ordinate to an integer
    private int convertCoOrdinate(String coOrd) {

        try{
            return Integer.parseInt(coOrd.strip());
        } catch (NumberFormatException e) {
            return -1;
        }
    }


    // update game board to reflect users guess
    private void updateGameBoard() {

        // if the user hit the destroyer
        if (this.checkHit() == true) {
            this.hitCount++;
            this.gameBoard[this.userGuess[0]][this.userGuess[1]] = "💥";

            System.out.println(this.toString());
            System.out.printf("Well done, you hit!%n%n");
        }
        // if the user missed the destroyer
        else {
            this.gameBoard[this.userGuess[0]][this.userGuess[1]] = "💦";

            System.out.println(this.toString());
            System.out.printf("Sorry, you missed!%n%n");
        }
    }

    // checks whether the players guess was correct
    private boolean checkHit() {
        // if the user guessed the x and y co-ord of one of the destroyer locations
        return ((this.userGuess[0] == this.destroyerCoOrdinates[0] &&
                this.userGuess[1] == this.destroyerCoOrdinates[1])
                ||
                (this.userGuess[0] == this.destroyerCoOrdinates[2] &&
                        this.userGuess[1] == this.destroyerCoOrdinates[3]));
    }

}
