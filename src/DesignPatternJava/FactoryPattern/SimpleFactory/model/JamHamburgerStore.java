package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;
import DesignPatternJava.FactoryPattern.SimpleFactory.controller.HamburgerStore;

public class JamHamburgerStore extends HamburgerStore {



    @Override
    public Hamburger createHamburger(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new JamaicanCheeseBurger();
        }else if (type.equalsIgnoreCase("veggie")) {
            return new JamaicanVeggieBurger();
        }else
        return null;
    }
}
