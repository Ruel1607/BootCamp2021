package OOP.OopCompositionExercise;

public class Main {
    public static void main(String[] args) {


        Aircon myAircon = new Aircon("SANYO",1.5);
        ElectricFan eFan = new ElectricFan("EURIKA","SMALL");
        BedAndPillows bnp = new BedAndPillows("FOAM",3 ,"Cloud SOFT ");

        BedRoom bR = new BedRoom(myAircon,eFan,bnp);

        bR.bedRoomCalled();

    }
}
