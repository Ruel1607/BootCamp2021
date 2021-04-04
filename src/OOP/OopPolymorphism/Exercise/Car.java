package OOP.OopPolymorphism.Exercise;

public class Car {
    private Boolean engine ;
    private int cylinder;
    private int wheels;
    private String name;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels =4;
        this.engine = true;
        
    }


    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
    
    public String startEngine(){
        return "ENGINE START";
    }
    public String accelerate(){
        return "ACCELERATE";
    }
    public String brake(){
        return "BREAK CALLED";
    }
}
class Nissan extends Car{
    public Nissan(int cylinder, String name){
        super(cylinder, name );
    }

    @Override
    public String startEngine() {
        return "NISSAN START";
    }

    @Override
    public String accelerate() {
        return "NISSAN ACCELERATE";
    }

    @Override
    public String brake() {
        return "NISSAN BREAK";
    }
}
class Toyota extends Car{
    public Toyota(int cylinder, String name){
        super(cylinder, name );
    }

    @Override
    public String startEngine() {
        return "TOYOTA START";
    }

    @Override
    public String accelerate() {
        return "TOYOTA ACCELERATE";
    }

    @Override
    public String brake() {
        return "TOYOTA BREAK";
    }
}
class Vios extends Car{
    public Vios(int cylinder, String name){
        super(cylinder, name );
    }

    @Override
    public String startEngine() {
        return "Vios START";
    }

    @Override
    public String accelerate() {
        return "Vios ACCELERATE";
    }

    @Override
    public String brake() {
        return "Vios BREAK";
    }
}
