package Practice4.problem3.app;

import Practice4.problem3.model.classes.IPhone;
import Practice4.problem3.model.classes.LogicGame;
import Practice4.problem3.model.classes.MemoryGame;
import Practice4.problem3.model.interfaces.Game;

public class MainApp {
    static void getStatistics(Game g) {
        System.out.println("Getting 'statistics'...");
        g.a();
        g.b();
        g.c();
    }

    static void main() {
        LogicGame game = new LogicGame();
        MemoryGame game2 = new MemoryGame();

        System.out.println("Getting 'statistics' for game...");
        getStatistics(game);

        System.out.println("\nGetting 'statistics' for game2...");
        getStatistics(game2);

        System.out.println("\n---------------\n");
        IPhone phone = new IPhone();
        phone.plug();
        phone.sell(); // bye!
    }
}
