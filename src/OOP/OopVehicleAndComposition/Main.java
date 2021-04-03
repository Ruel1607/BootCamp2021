package OOP.OopVehicleAndComposition;

public class Main {
    public static void main(String[] args) {

        Dimension dimension = new Dimension(20,10,5);
        Case theCase = new Case("2020B","DELL", "240", dimension);



        Monitor theMonitor = new Monitor("27INCHES","ACER",27,new Resolution(2540,1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ220", "ASUS", 4,6,"v3 ,44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

        thePC.powerUp();

    }
}
