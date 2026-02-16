package Practice3.delivery.model;

public class Vehicle {
    private final String model;
    private double baseCost;
    private Engine engine;

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    public double calculateDeliveryCost() {
        return baseCost;
    }

    public String getVehicleInfo() {
        return String.format(
                "-- VEHICLE INFORMATION --\nModel: %s\nBase cost: %.2f\nDelivery cost: %.2f\nEngine type: %s\n",
                getModel(), getBaseCost(), calculateDeliveryCost(), engine.getType()
        );
    }

    public String getModel() {
        return model;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
