package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class JamaicanVeggieBurger extends Hamburger {
    public JamaicanVeggieBurger() {
        name = "Jamaican Style VeggieBurger";
        sauce = "Spicy Jamaican Sauce";
        buns = "Cookie dough buns! ";
    }
    @Override
    public void cook() {
        System.out.println("COOKING Jamaican Veggie...");
    }
}
