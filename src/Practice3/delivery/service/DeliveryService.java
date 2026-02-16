package Practice3.delivery.service;

import Practice3.delivery.model.Vehicle;

import java.util.List;

public class DeliveryService {
    public void printAllVehicles(List<Vehicle> vehicles) {
        vehicles.forEach(it -> System.out.println(it.getVehicleInfo()));
    }

    public double calculateAllDeliveries(List<Vehicle> vehicles) {
        return vehicles
                .stream()
                .mapToDouble(Vehicle::calculateDeliveryCost)
                .sum();
    }

    public double calculateTotalCost(List<Vehicle> vehicles) {
        return vehicles
                .stream()
                .mapToDouble(Vehicle::getBaseCost)
                .sum();
    }
}
