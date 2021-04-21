package DesignPatternJava.DecoratorDesignPattern.Decorator.model;

import DesignPatternJava.DecoratorDesignPattern.Decorator.controller.IceCream;

public class BasicIceCream  implements IceCream {
    public BasicIceCream() {
        System.out.println("CREATING A BASIC ICE CREAM");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
