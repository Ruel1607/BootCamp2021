package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class MozambicanVeggieBurger extends Hamburger {
    public MozambicanVeggieBurger() {
        name = "Mozambican Style VeggieBurger";
        sauce = "Spicy Mozambican Sauce";
        buns = "Cookie dough buns! ";
    }

    @Override
    public void cook() {
        System.out.println("COOKING MOZAMBICAN...");
    }
}
