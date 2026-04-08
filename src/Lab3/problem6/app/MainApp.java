package Lab3.problem6.app;

import Lab3.problem6.models.classes.ProcrastinatingStudent;
import Lab3.problem6.models.classes.SmartDog;

public class MainApp {
    public static void main(String[] args) {
        SmartDog rex = new SmartDog("Rex", 4, "stay");
        SmartDog buddy = new SmartDog("Buddy", 2, "roll over");

        ProcrastinatingStudent tom = new ProcrastinatingStudent("Tom", 20, "Computer Science", rex);
        ProcrastinatingStudent anna = new ProcrastinatingStudent("Anna", 19, "Mathematics", buddy);

        System.out.println("Pet care:");
        System.out.println(tom.feedPet());
        System.out.println(anna.spendTimeWithPet());

        System.out.println("\nTraining:");
        rex.learnCommand("fetch");
        System.out.println(rex.performCommand());

        System.out.println("\nComparable:");
        System.out.println("tom.compareTo(anna) = " + tom.compareTo(anna));
        System.out.println("rex.compareTo(buddy) = " + rex.compareTo(buddy));

        System.out.println("\nCloneable:");
        ProcrastinatingStudent tomCopy = tom.clone();
        SmartDog rexCopy = rex.clone();
        System.out.println(tomCopy);
        System.out.println(rexCopy);
    }
}
