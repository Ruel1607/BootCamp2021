package com.company;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("INCREMENT LOOP");

        for (double i = 1; i < 10; i++) {
            System.out.println("10,000 at " + i + " % interest " + computeInterest(10000, i));
        }

        System.out.println("DECREMENT LOOP");
        for (double i = 10; i != 0; i--) {
            System.out.println("10,000 at " + i + " % interest " + computeInterest(10000, i));
        }

    }

    public static double computeInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static int fibonacci(int a, int b, int c) {
        return c = a + b;

    }
}
