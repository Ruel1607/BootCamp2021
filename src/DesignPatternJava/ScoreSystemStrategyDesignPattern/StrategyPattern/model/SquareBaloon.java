package DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.model;

import DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.conttroller.ScoreBoardBase;

public class SquareBaloon extends ScoreBoardBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
