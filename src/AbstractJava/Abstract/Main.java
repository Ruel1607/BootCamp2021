package AbstractJava.Abstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("DOGGY");
        dog.breathe();
        dog.eat();
        System.out.println(dog.getName());

        Parrot parrot = new Parrot("AUSIIE RINGNECK");
        parrot.breathe();
        parrot.eat();
        System.out.println(parrot.getName());


        Penguin penguin = new Penguin("EMPEROR");
        penguin.fly();
        penguin.breathe();
        penguin.eat();
        System.out.println( penguin.getName());
    }
}
