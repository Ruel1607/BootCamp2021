package DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.PaymentAlgorithm.controller;

import DesignPatternJava.ScoreSystemStrategyDesignPattern.Exercises.PaymentAlgorithm.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){

        productList.add(product);
        System.out.println(product.toString() + " IS ADDED");
    }
    public void removeProduct(Product product){
        productList.remove(product);
        System.out.println(product.toString() + " IS REMOVED");
    }
    public int calculateTotal(){
        int sum = 0 ;
        for(Product product : productList){
            sum += product.getPrice();
        }
        return sum;
    }
    public void pay(Payment paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);

    }

    public void printList(){
        for(Product product : productList ){
            System.out.println(product.toString());
        }
    }


}
