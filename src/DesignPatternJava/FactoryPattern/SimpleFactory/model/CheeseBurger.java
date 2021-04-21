package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class CheeseBurger  extends Hamburger {
    public CheeseBurger() {
        name = "SIMPLE FACTORY CheeseBurger";
        sauce = "Spicy  Sauce";
        buns = "Big buns! ";
    }
    @Override
    public void cook() {
        System.out.println("COOKING CheeseBurger..");
    }
}

