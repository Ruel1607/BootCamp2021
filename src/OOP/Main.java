package OOP;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("CARRERA");
        System.out.println("THE CAR MODEL FOR PORSCHE IS: " + porsche.getModel());
        holden.setModel("Commodore");
        System.out.println("THE CAR MODEL FOR HOLDEN IS: " + holden.getModel());

    }
}
