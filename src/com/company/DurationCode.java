package com.company;

public class DurationCode {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(78770L));
    }
    public static String getDurationString(long minutes, long seconds){

        if((minutes < 0) || (seconds <0 )|| (seconds > 59)){
            return "INVALID VALUE ";
        }
        long hours = minutes / 60 ;
        long minutesRemaining = minutes % 60 ;
        return " HOURS:" + hours + " MINUTES :" + minutesRemaining + " SECONDS:" + seconds ;
    }
    public static String getDurationString( long seconds) {

        if (seconds < 0){
            return "INVALID VALUE";
        }
        long minutes = seconds / 60;
        long secondsLeft = seconds % 60;
        return getDurationString(minutes,secondsLeft);


    }
}
