package Lab1;

import java.util.Random;

public class Problem2 {
    static void main() {
        GameHero hero = new GameHero("Alexander", HeroClass.MAGE);
        hero.attack();
        hero.attack("Topaz Staff");
        System.out.printf("\nName: %s (id %d)\nClass: %s\nExp: %d\n",
                hero.getName(), hero.getId(), hero.getHeroClass(), hero.getTotalExp()
        );

        System.out.println();

        GameHero stranger = new GameHero("Anton");
        stranger.attack();
        stranger.attack("Buliwyf Stonehand");
        System.out.printf("\nName: %s (id %d)\nClass: %s\nExp: %d\n",
                stranger.getName(), stranger.getId(), stranger.getHeroClass(), stranger.getTotalExp()
        );

        System.out.println("\nTotal heroes: " + GameHero.getTotalHeroes());
    }
}

enum HeroClass {
    WARRIOR, MAGE, ARCHER, ROGUE
}

class GameHero {
    public static final int MAX_EXP = 100;
    private static int totalHeroesCreated = 0;
    private final int heroId;
    private static int nextId = 0;

    private String name;
    private final HeroClass heroClass;
    private int totalExp;

    {
        heroId = nextId;
        nextId++;
        totalHeroesCreated++;
        System.out.println("Initializing new hero data...");
    }

    public GameHero(String name, HeroClass heroClass) {
        this.name = name;
        this.heroClass = heroClass;
        this.totalExp = 0;
    }

    public GameHero(String name) {
        this(name, HeroClass.WARRIOR);
    }

    public void attack() {
        System.out.println(name + " attacks with bare hands!");
        earnExp(10);
    }

    public void attack(String weapon) {
        System.out.println(name + " attacks using " + weapon + "!");
        earnExp(15);
    }

    public int getId() {
        return heroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public static int getTotalHeroes() {
        return totalHeroesCreated;
    }

    private void earnExp(int bound) {
        Random rand = new Random();
        int earnedExp = rand.nextInt(1, bound);

        if (totalExp == MAX_EXP) {
            System.out.println("Earned exp: " + earnedExp + " (in futile...)");
        } else if (totalExp + earnedExp >= MAX_EXP) {
            totalExp = MAX_EXP;
            System.out.println("Max level is reached!");
        } else {
            totalExp += earnedExp;
            System.out.println("Earned exp: " + earnedExp);
        }
    }
}
