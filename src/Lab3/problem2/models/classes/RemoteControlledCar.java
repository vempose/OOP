package Lab3.problem2.models.classes;

import Lab3.problem2.models.interfaces.Navigable;

public class RemoteControlledCar implements Navigable {
    @Override
    public void changeDirection() {
        System.out.println("RemoteControlledCar is changing direction...");
    }

    @Override
    public void move() {
        System.out.println("RemoteControlledCar is moving...");
    }
}
