package DesignPatternJava.DecoratorDesignPattern.Decorator.model;

import DesignPatternJava.DecoratorDesignPattern.Decorator.controller.IceCream;
import DesignPatternJava.DecoratorDesignPattern.Decorator.controller.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator{


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("YOU ADD CHOCOLATE ICE CREAM");
        return 1.0 + super.cost();
    }
}
