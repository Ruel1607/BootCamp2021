package OOP.OopPolymorphism.Exercise;


public class PolymorphismExercise {
    public static void main(String[] args) {
        System.out.println("*********************CAR MODEL************************");
            Car car = new Car(8, "BASE CAR");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("*********************CAR MODEL************************");


        Car toyota = new Toyota(4,"FIRSTCar");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        System.out.println("*********************CAR MODEL************************");

        Nissan nissan = new Nissan(8, "NISSAN CAR");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake());

        System.out.println("*********************CAR MODEL************************");

        Vios vios = new Vios(8,"FIRST CAR");

        System.out.println(vios.startEngine());
        System.out.println(vios.accelerate());
        System.out.println(vios.brake());
    }


}

