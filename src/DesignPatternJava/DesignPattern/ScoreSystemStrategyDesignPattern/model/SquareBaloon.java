package DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.model;

import DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.conttroller.ScoreBoardBase;

public class SquareBaloon extends ScoreBoardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
