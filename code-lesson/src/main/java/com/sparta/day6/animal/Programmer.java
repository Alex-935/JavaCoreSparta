package com.sparta.day6.animal;

public class Programmer extends Animal {

    private String favouriteGame;

    Programmer(String name, int year, int month, int day, String favouriteGame) {
        super(name, year, month, day);

        this.favouriteGame = favouriteGame;
    }


    private String getFavouriteGame() {
        return this.favouriteGame;
    }

    @Override
    public String toString() {
        return super.toString() + " Their favourite game is " + this.getFavouriteGame() + ".";
    }

    @Override
    public String speak() {
        return "Hello World";
    }
}
