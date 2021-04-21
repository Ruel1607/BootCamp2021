package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;

public class JamaicanCheeseBurger extends Hamburger {


    public JamaicanCheeseBurger() {

        name = "Jamaican Style CheeseBurger";
        sauce = "Spicy Jamaican Sauce";
        buns = "Cookie dough buns! ";
    }
    @Override
    public void cook() {
        System.out.println("COOKING Jamaican STYLE...");
    }




}
