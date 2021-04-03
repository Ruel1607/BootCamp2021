package OOP.OopInheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name,  int size, int weight, int gills,int eyes,int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;

    }


    private void rest(){
        System.out.println("REST CALLED");
    }

    private void moveMuscles(){
        System.out.println("MOVE MUSCLE CALLED");
    }
    private void moveBackFin(){
        System.out.println("MOVEBACK FIN CALLED");
    }
    public void swim(int speed){
        System.out.println("FISH SWIM CALLED SPEED :  " + speed );
        rest();
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }
}
