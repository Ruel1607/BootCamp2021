package DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.conttroller;

public class Scoreboard {
    public ScoreBoardBase scoreboardAlgo;

    public void showScore(int taps,int multiplier){
        System.out.println(scoreboardAlgo.calculateScore(taps,multiplier));
    }
}
