package OOP.OopCompositionExercise;

public class PowerUsage {
    private int volts ;


    public PowerUsage(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public static int calculateScore(int score) {
        System.out.println(" Score : " + score);
        return score * 1000;
    }

    public static int  computeMonthlyUsage(int hoursUsage, int days){
       int total = (hoursUsage * days) *  12;
        System.out.println("TOTAL MONTHLY BILL FOR HOUSE: " + total);
       return  total;

     }

    @Override
    public String toString() {
        return "PowerUsage{" +
                "volts=" + volts +
                '}';
    }
}
