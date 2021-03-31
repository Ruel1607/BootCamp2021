package OOP;

public class Car {



    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car() {

    }

    public Car(int door, int wheels, String model, String engine, String color) {
        this.door = door;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }



    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "unknown";
        }

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
