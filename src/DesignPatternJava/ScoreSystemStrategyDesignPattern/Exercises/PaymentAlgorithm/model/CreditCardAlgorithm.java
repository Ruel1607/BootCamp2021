package DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.PaymentAlgorithm.model;

import DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.PaymentAlgorithm.controller.Payment;

public class CreditCardAlgorithm implements Payment {

    private String name;
    private String cardNumber;

    public CreditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(this.name.toString() + " " +  this.cardNumber.toString());
        System.out.println(amount + " PAID WITH CARD");
    }
}
