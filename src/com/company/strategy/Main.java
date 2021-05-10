package com.company.strategy;

public class Main {

    public static void main(String[] args) {

        Scoreboard  scoreboard = new Scoreboard();
        System.out.println("Score Using Ballon : ");
        scoreboard.algorithmBase = new Ballon();
        scoreboard.showScore(5,10);
        System.out.println("Score Using Square Ballon : ");
        scoreboard.algorithmBase = new SquareBallon();
        scoreboard.showScore(5,10);
    }
}
