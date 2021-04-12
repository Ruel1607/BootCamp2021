package AbstractJava.Abstract;

public abstract  class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void breathe();

     void walk() {
        System.out.println("WALK");
    }

    public String getName() {
        return name;
    }
}
