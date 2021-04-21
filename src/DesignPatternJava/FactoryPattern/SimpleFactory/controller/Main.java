package DesignPatternJava.FactoryPattern.SimpleFactory.controller;

import DesignPatternJava.FactoryPattern.SimpleFactory.model.JamHamburgerStore;
import DesignPatternJava.FactoryPattern.SimpleFactory.model.MozHamburgerStore;
import DesignPatternJava.FactoryPattern.SimpleFactory.model.SimpleHamburgerFactory;

public class Main {
    public static void main(String[] args) {

        HamburgerStore mozamHamburgerStore = new MozHamburgerStore();
        HamburgerStore jamHamburgerStore = new JamHamburgerStore();
        HamburgerStore hamburgerStore = new SimpleHamburgerFactory();


        Hamburger hamburger = mozamHamburgerStore.orderHamburger("CHEESE");
        System.out.println("YOU ORDERED " + hamburger.getName() );
        System.out.println("=====================================");
        Hamburger hamburger1 = jamHamburgerStore.orderHamburger("Veggie");
        System.out.println("YOU ORDERED " + hamburger1.getName() );

        System.out.println("=====================================");

        hamburger1 = jamHamburgerStore.orderHamburger("Cheese");
        System.out.println("YOU ORDERED " + hamburger1.getName() );
        System.out.println("=====================================");

        hamburger1 = mozamHamburgerStore.orderHamburger("veggie");
        System.out.println("YOU ORDERED " + hamburger1.getName() );

        System.out.println("=====================================");
        hamburger1 = hamburgerStore.orderHamburger("veggie");
        System.out.println("YOU ORDERED " + hamburger1.getName() );

        System.out.println("=====================================");
        hamburger1 = hamburgerStore.orderHamburger("cheese");
        System.out.println("YOU ORDERED " + hamburger1.getName() );
        System.out.println("=====================================");
        hamburger1 = hamburgerStore.orderHamburger("meat");
        System.out.println("YOU ORDERED " + hamburger1.getName() );


    }
}