package Practice2.problem3.app;

import Practice2.problem3.models.Time;

public class MainApp {
    static void main() {
        Time time1 = new Time(10, 0, 0);
        Time time2 = new Time(5, 5, 5);
        System.out.printf("%-35s %s\n", "Time1:", time1.toUniversal());
        System.out.printf("%-35s %s\n", "Time2", time2.toUniversal());

        time1.add(time2);
        System.out.printf("%-35s %s\n", "Time1 after adding Time2 to it:", time1.toUniversal());
    }
}
