package com.company.strategy;

public class Scoreboard {

    public ScoreboardBase algorithmBase;

    public void showScore(int a, int b){
        System.out.println(algorithmBase.calculateScore(a,b));
    }
}
