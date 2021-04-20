package DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.conttroller;

public class Scoreboard {
    public ScoreBoardBase scoreboardAlgo;

    public void showScore(int taps,int multiplier){
        System.out.println(scoreboardAlgo.calculateScore(taps,multiplier));
    }
}
