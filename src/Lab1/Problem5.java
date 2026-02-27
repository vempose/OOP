package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();

        dragon.kidnap(new Person(Gender.BOY));
        dragon.kidnap(new Person(Gender.BOY));
        dragon.kidnap(new Person(Gender.GIRL));
        dragon.kidnap(new Person(Gender.GIRL));

        System.out.print("Line BBGG: ");
        System.out.println(dragon.willDragonEatOrNot() ? "The dragon feasts." : "The dragon starves...");

        DragonLaunch dragon2 = new DragonLaunch();
        dragon2.kidnap(new Person(Gender.GIRL));
        dragon2.kidnap(new Person(Gender.BOY));
        dragon2.kidnap(new Person(Gender.GIRL));
        dragon2.kidnap(new Person(Gender.BOY));

        System.out.print("Line GBGB: ");
        System.out.println(dragon2.willDragonEatOrNot() ? "The dragon feasts." : "The dragon starves...");

    }
}

enum Gender {
    BOY, GIRL
}

class Person {
    private final Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender == Gender.BOY ? "Boy" : "Girl";
    }
}

class DragonLaunch {
    private List<Person> kidnapped;

    public DragonLaunch() {
        kidnapped = new ArrayList<Person>();
    }

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boysCounter = 0;
        int strayGirls = 0;

        for (Person p : kidnapped) {
            if (p.getGender() == Gender.BOY) {
                boysCounter++;
            } else {
                if (boysCounter > 0) {
                    boysCounter--;
                } else {
                    strayGirls++;
                }
            }
        }

        return (strayGirls + boysCounter) > 0;
    }

}
