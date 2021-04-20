package DesignPatternJava.Exercises.PaymentAlgorithm.model;

import DesignPatternJava.Exercises.PaymentAlgorithm.controller.Payment;
import DesignPatternJava.Exercises.PaymentAlgorithm.controller.ShoppingCart;

public class PaypalAlgorithm implements Payment {

    private String email;
    private String password;

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " PAID WITH PAYPAL");
    }
}
