package com.company.strategy;

public class SquareBallon implements ScoreboardBase {

    @Override
    public int calculateScore(int a, int b) {
        return 30 + a*b;
    }
}
