package OOP.OopCompositionExercise;

public class BedRoom {
    private Aircon aircon ;
    private ElectricFan eFan;
    private BedAndPillows bnp ;
    private PowerUsage pwr ;

    public BedRoom(Aircon aircon, ElectricFan eFan, BedAndPillows bnp) {
        this.aircon = aircon;
        this.eFan = eFan;
        this.bnp = bnp;
    }

    public void bedRoomCalled(){
        powerUsage();
    }
    private void powerUsage(){
        pwr.computeMonthlyUsage(12,16);
        display();
        }


    private void  display() {
        String s = "BedRoom{" +
                "aircon=" + aircon.toString()+
                ", eFan=" + eFan +
                ", bnp=" + bnp.toString() +

                '}';
        System.out.println(s);
        ;
    }
}
