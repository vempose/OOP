package Lab3.problem5.models;

public class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;

    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chocolate: name = '%s', weight = %s".formatted(name, weight);
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }
}
