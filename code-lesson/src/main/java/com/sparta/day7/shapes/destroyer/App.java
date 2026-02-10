package com.sparta.day7.shapes.destroyer;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner  =  new Scanner(System.in);
        DestroyerApp battleship = new DestroyerApp(scanner);
    }
}
