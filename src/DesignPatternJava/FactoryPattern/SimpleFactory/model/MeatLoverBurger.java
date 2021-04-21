package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class MeatLoverBurger extends Hamburger {
    public MeatLoverBurger() {
        name = "SIMPLE FACTORY MeatLoverBurger";
        sauce = "Spicy  Sauce";
        buns = "Big buns! ";
    }
    @Override
    public void cook() {
        System.out.println("COOKING MeatLoverBurger..");
    }
}



