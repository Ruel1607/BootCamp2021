package DesignPatternJava.DecoratorDesignPattern.Decorator.model;

import DesignPatternJava.DecoratorDesignPattern.Decorator.controller.IceCream;
import DesignPatternJava.DecoratorDesignPattern.Decorator.controller.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("YOU ADD MINT ICE CREAM");
        return 1.50 + super.cost();
    }
}
