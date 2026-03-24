package Practice4.problem3.models;

import Practice4.problem3.interfaces.SellableAndPluggable;

public class IPhone implements SellableAndPluggable {
    @Override
    public void plug() {
        System.out.println("Plugging IPhone...");
    }

    @Override
    public void sell() {
        System.out.println("Selling IPhone...");
    }
}
