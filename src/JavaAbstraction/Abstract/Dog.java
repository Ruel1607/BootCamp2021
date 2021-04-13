package JavaAbstraction.Abstract;

public class Dog extends  Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " IS EATING");
    }

    @Override
    public void breathe() {
        System.out.println("BREATH DOG");
    }
}
