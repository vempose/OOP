package Lab3.problem6.models.classes;

import Lab2.problem5.model.Dog;
import Lab3.problem6.models.interfaces.TrainablePet;

public class SmartDog extends Dog implements Comparable<SmartDog>, Cloneable, TrainablePet {
    private String learnedCommand;

    public SmartDog(String name, int age) {
        this(name, age, "sit");
    }

    public SmartDog(String name, int age, String learnedCommand) {
        super(name, age);
        this.learnedCommand = learnedCommand;
    }

    public String getLearnedCommand() {
        return learnedCommand;
    }

    @Override
    public void learnCommand(String command) {
        this.learnedCommand = command;
    }

    @Override
    public String performCommand() {
        return "%s performs the command: %s.".formatted(getName(), learnedCommand);
    }

    @Override
    public int compareTo(SmartDog other) {
        int ageComparison = Integer.compare(this.getAge(), other.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }

        return this.getName().compareTo(other.getName());
    }

    @Override
    public SmartDog clone() {
        return new SmartDog(getName(), getAge(), learnedCommand);
    }

    @Override
    public String toString() {
        return "%s, trained command: %s".formatted(super.toString(), learnedCommand);
    }
}
