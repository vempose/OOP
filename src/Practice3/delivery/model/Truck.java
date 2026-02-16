package Practice3.delivery.model;

public class Truck extends Vehicle {
    private final int maxLoad;

    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return getBaseCost() * (maxLoad * 0.001);
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return calculateDeliveryCost() * distance * fuelPrice;
    }
}
