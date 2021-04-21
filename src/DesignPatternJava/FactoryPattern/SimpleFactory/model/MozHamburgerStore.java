package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;
import DesignPatternJava.FactoryPattern.SimpleFactory.controller.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new MozambicanCheeseBurger();
        }else if (type.equalsIgnoreCase("veggie")) {
            return new MozambicanVeggieBurger();
        }else
            return null;
    }
}