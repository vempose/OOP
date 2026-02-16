package Practice3.delivery.app;

import Practice3.delivery.model.Car;
import Practice3.delivery.model.Engine;
import Practice3.delivery.model.Truck;
import Practice3.delivery.model.Vehicle;
import Practice3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    static void main() {
        Engine engine1 = new Engine("V6", 250.0);
        Engine engine2 = new Engine("Diesel", 600);

        Car car = new Car("Ford Mustang", 2_000.00, engine1, 2);
        Truck truck = new Truck("Peterbilt 389", 12_000.00, engine2, 100_000);

        List<Vehicle> vehicles = new ArrayList<>(List.of(car, truck));
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.printAllVehicles(vehicles);
        System.out.println("Cost of all deliveries: " + deliveryService.calculateAllDeliveries(vehicles));
        System.out.println("Total cost of vehicles: " + deliveryService.calculateTotalCost(vehicles));
    }
}
