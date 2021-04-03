package OOP.OopInheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);
        Dog dog = new Dog("Bonsai",8,20,2,4,1,20,"Long Silky");
        dog.eat();
        System.out.println(dog.toString());
        dog.run();
        dog.walk();


        System.out.println("###############################################");
        Fish fish = new Fish("CARP",12,8,6,2,24);

        fish.swim(10);




    }
}
