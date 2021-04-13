package JavaAbstraction.Abstract;

public class Penguin extends Bird implements canFly {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("PENGUIN IS EATING");
    }

    @Override
    public void breathe() {
        System.out.println("PENGUIN IS BREATHE");
    }

    @Override
    public void fly() {
        System.out.println("PENGUIN IS FLYING ??");
    }






}
