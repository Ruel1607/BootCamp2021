package OOP.OopCompositionExercise;

public class Aircon {
    private String model;
    private Double horsePower;


    public Aircon(String model, Double horsePower) {
        this.model = model;
        this.horsePower = horsePower;

    }

    public String getModel() {
        return model;
    }

    public Double getHorsePower() {
        return horsePower;

    }

    @Override
    public String toString() {
        String s ="Aircon{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
        return s ;
    }
}