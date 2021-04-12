package AbstractionJava.Abstract;

public class Parrot extends Bird implements canFly{


    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("PARROT EATING");
    }

    @Override
    public void breathe() {
        System.out.println("PARROT BREATHING");
    }

    @Override
    public void fly() {
        System.out.println("PARROT FLY");
    }

}
