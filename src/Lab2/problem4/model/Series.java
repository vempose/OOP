package Lab2.problem4.model;

public class Series extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double voltage) {
        this.potentialDifference = voltage;

        double totalResistance = getResistance();
        double current = voltage / totalResistance;

        double v1 = current * first.getResistance();
        double v2 = current * second.getResistance();

        first.applyPotentialDiff(v1);
        second.applyPotentialDiff(v2);
    }
}
