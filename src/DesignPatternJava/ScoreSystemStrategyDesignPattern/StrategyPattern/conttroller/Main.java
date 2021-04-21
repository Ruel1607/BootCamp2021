package DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.conttroller;

import DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.model.Baloon;
import DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.model.Clown;
import DesignPatternJava.ScoreSystemStrategyDesignPattern.StrategyPattern.model.SquareBaloon;

public class Main {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();


        System.out.print("Baloon Tap Score: ");
        scoreboard.scoreboardAlgo = new Baloon();
        scoreboard.showScore(10,5);
        System.out.print("CLOWN TAP SCORE:" );
        scoreboard.scoreboardAlgo = new Clown();
        scoreboard.showScore(10,5);
        System.out.print("Sqaure baloon TAP SCORE:");
        scoreboard.scoreboardAlgo = new SquareBaloon();
        scoreboard.showScore(10,5);




    }
}
