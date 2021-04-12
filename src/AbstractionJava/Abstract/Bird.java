package AbstractionJava.Abstract;

public abstract class Bird  extends  Animal {
    public Bird(String name) {
        super(name);

    }


    @Override
    public abstract void eat();

    @Override
    public abstract void breathe();


}
