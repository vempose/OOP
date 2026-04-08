package Lab3.problem2.models.classes;

import Lab3.problem2.models.interfaces.AutomaticallyMoveable;

public class Drone implements AutomaticallyMoveable {
    @Override
    public void autoMove() {
        System.out.println("Drone is auto moving...");
    }

    @Override
    public void move() {
        System.out.println("Drone is moving...");
    }
}
