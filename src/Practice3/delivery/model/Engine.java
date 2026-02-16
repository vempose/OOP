package Practice3.delivery.model;

public class Engine {
    private final String type;
    private final double horsepower;

    public Engine(String type, double horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void getEngineInfo() {
        System.out.printf("-- ENGINE INFO --\nEngine type: %s\nHorsepower: %.2f\n", getType(), getHorsepower());
    }

    public String getType() {
        return type;
    }

    public double getHorsepower() {
        return horsepower;
    }
}
