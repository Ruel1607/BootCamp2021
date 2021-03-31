package com.company.JAVA;

import java.util.Scanner;

public class AstrologicalSignSwitchCase {

    public static void main(String[] args) {


        String ans;
        do {
            int day;
            String month;
            Scanner scanner = new Scanner(System.in);

            System.out.println("**********WELCOME TO ASTROLOGICAL SIGN**********");
            System.out.println("Please enter your birthmonth : ");
            month = scanner.next();
            System.out.println("Birthdate: ");
            day = scanner.nextInt();


            String sign;
            switch (month.toUpperCase()) {
                case "JANUARY":
                    sign = day >= 20 ? "Aquarius" : "Capricorn";
                    break;
                case "FEBRUARY":
                    sign = day >= 19 ? "Pisces" : "Aquarius";
                    break;
                case "MARCH":
                    sign = day >= 21 ? "Aries" : "Pisces";
                    break;
                case "APRIL":
                    sign = day >= 20 ? "Taurus" : "Aries";
                    break;
                case "MAY":
                    sign = day >= 21 ? "Gemini" : "Taurus";
                    break;
                case "JUNE":
                    sign = day >= 21 ? "Cancer" : "Gemini";
                    break;
                case "JULY":
                    sign = day >= 23 ? "Leo" : "Cancer";
                    break;
                case "AUGUST":
                    sign = day >= 23 ? "Virgo" : "Leo";
                    break;
                case "SEPTEMBER":
                    sign = day >= 23 ? "Libra" : "Virgo";
                    break;
                case "OCTOBER":
                    sign = day >= 23 ? "Scorpio" : "Libra";
                    break;
                case "NOVEMBER":
                    sign = day >= 22 ? "Sagittarius" : "Scorpio";
                    break;
                case "DECEMBER":
                    sign = day >= 22 ? "Capricorn" : "Sagittarius";
                    break;
                default:
                    System.out.printf("You have entered wrong details !!! ");
                    return;
            }
            System.out.println("The astrological sign is  : " + sign);
            System.out.print("Do you want to continue ? type y/n? : ");
            ans = scanner.next();


        } while (ans.equalsIgnoreCase("y"));

        System.out.println("THANKS");

    }

}
