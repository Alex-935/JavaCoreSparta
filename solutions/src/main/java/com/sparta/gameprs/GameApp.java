package com.sparta.gameprs;

import java.util.Scanner;

public class GameApp {
    static void main() {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        while (game.playOn()) {
            String userChoice;
            System.out.print("Paper, rock, scissors? ");
            userChoice = scanner.next();
            System.out.println(game.playRound(userChoice));
            System.out.println(game.getResult());
        }
    }
}
