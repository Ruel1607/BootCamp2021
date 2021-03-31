package com.company;

import java.util.Scanner;

public class CalculatorJava {
    public static void main(String[] args) {

        String ans;
        do {
            int num1, num2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose MATH operation");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");


            System.out.print("Enter number of operation you choose :");
            int operator = scanner.nextInt();

            System.out.print("Enter first number:");
            num1 = scanner.nextInt();
            System.out.print("Enter second number:");
            num2 = scanner.nextInt();

            int output;


            switch (operator) {
                case 1:
                    output = num1 + num2;
                    break;
                case 2:
                    output = num1 - num2;
                    break;
                case 3:
                    output = num1 * num2;
                    break;
                case 4:
                    output = num1 / num2;
                    break;
                default:
                    System.out.printf("You have entered wrong operator");
                    return;
            }

            System.out.println(output);
            System.out.print("Do you want to continue ? type y/n? : ");
            ans = scanner.next();


        } while (ans.equalsIgnoreCase("y"));

        System.out.println("THANKS");

    }
}
