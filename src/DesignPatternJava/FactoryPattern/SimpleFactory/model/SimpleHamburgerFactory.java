package DesignPatternJava.FactoryPattern.SimpleFactory.model;

import DesignPatternJava.FactoryPattern.SimpleFactory.controller.Hamburger;
import DesignPatternJava.FactoryPattern.SimpleFactory.controller.HamburgerStore;

public class SimpleHamburgerFactory extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new CheeseBurger();
        }else if (type.equalsIgnoreCase("veggie")) {
            return new VeggieBurger();
        }else if(type.equalsIgnoreCase("meat")){
            return new MeatLoverBurger();
        }else
            return null;
    }
}