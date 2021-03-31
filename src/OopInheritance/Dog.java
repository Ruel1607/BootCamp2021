package OopInheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    @Override
    public String toString() {
        return "Dog{"  + " Name=" + this.getName() + " Brain=" + this.getBrain() +
                " BODY=" + this.getBody() +
                " SIZE=" + this.getSize() +
                " WEIGHT=" + this.getWeight() +
                " eyes=" + eyes +
                ", legs=" + legs +
                ", tail=" + tail +
                ", teeth=" + teeth +
                ", coat='" + coat + '\'' +
                '}';
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail =tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("DOG CHEW CALLED");
    }
    @Override
    public void eat(){
        System.out.println("DOG EAT CALLED");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("DOG WALK");
        move(5);
    }
    public void run(){
        System.out.println("DOG RUN");
        move(10);

    }

    @Override
    public void move(int speed) {
        System.out.println("DOG.MOVE CALLED");
        moveLegs(speed);

    }

    private void moveLegs(int speed) {
        System.out.println("DOG MOVELEGS CALLED=" + speed);
    }
}
