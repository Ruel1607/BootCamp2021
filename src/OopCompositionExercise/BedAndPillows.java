package OopCompositionExercise;

public class BedAndPillows {
    private String bedType;
    private int pillows;
    private String pillowModel ;

    public BedAndPillows(String bedType, int pillows, String pillowModel) {
        this.bedType = bedType;
        this.pillows = pillows;
        this.pillowModel = pillowModel;
    }

    public String getBedType() {
        return bedType;
    }

    public int getPillows() {
        return pillows;
    }

    public String getPillowModel() {
        return pillowModel;
    }

    @Override
    public String toString() {
        String s =  "BedAndPillows{" +
                "bedType='" + bedType + '\'' +
                ", pillows=" + pillows +
                ", pillowModel='" + pillowModel + '\'' +
                '}';
        return  s;
    }
}
