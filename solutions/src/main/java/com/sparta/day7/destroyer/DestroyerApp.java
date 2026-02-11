package com.sparta.day7.destroyer;

import java.util.Random;
import java.util.Scanner;

public class DestroyerApp {
    static void main() {
        Random random = new Random(System.currentTimeMillis());
        Destroyer destroyer = new Destroyer(random);
        Game game = new Game(destroyer);
        System.out.print(game.renderGrid());
        Scanner scanner = new Scanner(System.in);
        while (destroyer.isOperational()) {
            try {
                System.out.print("Enter a shot (x y): ");
                boolean duplicateShot;
                int x, y;
                do {
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    duplicateShot = game.shoot(new Coords(x, y));
                } while (duplicateShot);
                System.out.print(game.renderGrid());
                System.out.println(game.getLastShotResult());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
