package com.company.strategy;

public class Ballon implements ScoreboardBase {

    @Override
    public int calculateScore(int a, int b) {
        return 20 + a*b;
    }
}
