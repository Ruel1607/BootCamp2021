package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
         int newScore = calculateScore("Ruel", 500);
        System.out.println("NEW SCORE :" + newScore);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player name: " + playerName + "  Score : " + score);
        return score * 1000 ;
    }
    public static int calculateScore(int score){
        System.out.println(" Score : " + score);
        return score * 1000 ;
    }

}
