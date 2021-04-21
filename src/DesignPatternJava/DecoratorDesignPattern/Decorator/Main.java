package DesignPatternJava.DecoratorDesignPattern.Decorator;

import DesignPatternJava.DecoratorDesignPattern.Decorator.controller.IceCream;
import DesignPatternJava.DecoratorDesignPattern.Decorator.model.BasicIceCream;
import DesignPatternJava.DecoratorDesignPattern.Decorator.model.ChocolateIceCream;
import DesignPatternJava.DecoratorDesignPattern.Decorator.model.MintIceCream;
import DesignPatternJava.DecoratorDesignPattern.Decorator.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {

        IceCream iceCream = new BasicIceCream();

        System.out.println("COST: $" + iceCream.cost());


        //add vanilla order

        IceCream vanilla = new VanillaIceCream(iceCream);

        System.out.println("ADDING VANILLA \n COST: $" + vanilla.cost()); // WRAPPING WITH VANILLA

        //add chocolate

        IceCream chocolate = new ChocolateIceCream(vanilla);

        System.out.println("ADDING CHOCOLATE \n COST: $" + chocolate.cost()); // WRAPPING WITH Chocolate

        IceCream mint = new MintIceCream(chocolate);

        System.out.println("ADDING MINT \n COST: $" + mint.cost()); // WRAPPING WITH MINT


    }
}
