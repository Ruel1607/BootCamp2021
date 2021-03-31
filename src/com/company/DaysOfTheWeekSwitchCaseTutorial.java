package com.company;

public class DaysOfTheWeekSwitchCaseTutorial {

    public static void main(String[] args) {
        printDaysOfTheWeek(8);
    }
    public static void printDaysOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("INVALID NUMBER INPUT");
                break;

        }
    }

}
