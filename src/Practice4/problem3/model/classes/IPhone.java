package Practice4.problem3.model.classes;

import Practice4.problem3.model.interfaces.SellableAndPluggable;

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
