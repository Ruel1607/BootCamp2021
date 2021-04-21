package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class VeggieBurger extends Hamburger {
    public VeggieBurger() {
        name = "SIMPLE FACTORY VeggieBurger";
        sauce = "Veggie  Sauce";
        buns = "Big buns! ";
    }
    @Override
    public void cook() {
        System.out.println("COOKING VeggieBurger..");
    }
}
