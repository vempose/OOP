package Practice3.delivery.model;

public class Car extends Vehicle {
    private final int numberOfSeats;

    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return getBaseCost() * (numberOfSeats * 0.8);
    }

    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() * extraWeight;
    }
}
