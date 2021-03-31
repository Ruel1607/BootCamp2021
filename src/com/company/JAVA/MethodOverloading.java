package com.company.JAVA;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Ruel", 500);
        System.out.println("NEW SCORE :" + newScore);
        int newScore2 = calculateScore(600);
        System.out.println("SCORE " + newScore2);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player name: " + playerName + "  Score : " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println(" Score : " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("NO SCORE");
        return 0;
    }

}
