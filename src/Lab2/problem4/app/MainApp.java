package Lab2.problem4.app;

import Lab2.problem4.model.Circuit;
import Lab2.problem4.model.Parallel;
import Lab2.problem4.model.Resistor;
import Lab2.problem4.model.Series;

public class MainApp {
    static void main() {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        double resistance = circuit.getResistance();
        System.out.printf("Equivalent resistance = %.2f\n", resistance);

        circuit.applyPotentialDiff(12.0);

        System.out.printf("Circuit voltage = %.2f\n", circuit.getPotentialDiff());
        System.out.printf("Circuit current = %.2f\n", circuit.getCurrent());
        System.out.printf("Circuit power = %.2f\n", circuit.getPower());
    }
}
