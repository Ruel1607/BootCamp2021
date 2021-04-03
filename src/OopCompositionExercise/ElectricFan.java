package OopCompositionExercise;

public class ElectricFan {
    private String model ;
    private String size ;

    public ElectricFan(String model, String size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {

        return model;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        String s =  "ElectricFan{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                '}';
        return s;
    }
}
