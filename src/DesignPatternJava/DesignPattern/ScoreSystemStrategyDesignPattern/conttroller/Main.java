package DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.conttroller;

import DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.model.Baloon;
import DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.model.Clown;
import DesignPatternJava.DesignPattern.ScoreSystemStrategyDesignPattern.model.SquareBaloon;

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
