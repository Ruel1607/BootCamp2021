package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class MozambicanCheeseBurger extends Hamburger {
    public MozambicanCheeseBurger() {

        name = "Mozambican Style CheeseBurger";
        sauce = "Spicy Mozambican Sauce";
        buns = "Cookie dough buns! ";
    }
    @Override
    public void cook() {
        System.out.println("COOKING MOZAMBICAN...");
    }
}
