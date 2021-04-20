package DesignPatternJava.Exercises.PaymentAlgorithm.controller;

import DesignPatternJava.Exercises.PaymentAlgorithm.model.CreditCardAlgorithm;
import DesignPatternJava.Exercises.PaymentAlgorithm.model.PaypalAlgorithm;
import DesignPatternJava.Exercises.PaymentAlgorithm.model.Product;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product(25, "234");
        Product shirt = new Product(15,"123");
        Product watch = new Product(250 ,"GSHOCK");

        cart.addProduct(pants);
        cart.addProduct(shirt);
        cart.addProduct(watch);


        //payment decisions for paypal

        cart.pay(new PaypalAlgorithm("Ruel.lacabaph@gmail.com", "12321321"));


        // card payment

        cart.pay(new CreditCardAlgorithm("Ruel","123213"));

        cart.removeProduct(pants);


        System.out.println("===========================================" +
                "\n PRINT LIST");
        cart.printList();


    }
}
