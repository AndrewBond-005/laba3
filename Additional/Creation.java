package Additional;

import Humanoid.Woman;
import Humanoid.Human;
import Humanoid.King;
import Humanoid.Notifier;
import Humanoid.Prince;

import java.util.ArrayList;
import java.util.List;

public final class Creation {
    public static King king = new King();
    public static Ring ring = new Ring(Size.SMALL, "кольцо");
    public static Prince prince = new Prince("принц");
    public static List<Woman> women = Creation.makeWomen();
    public static List<Human> humans = new ArrayList<>(women);
    public static List<Notifier> notifiers = new ArrayList<>();
    public static List<Woman> elected = new ArrayList<>();
    public static String[] notifier = {"барабанщики", "глашатаи"};

    public static List makeWomen() {
        List<String> title = new ArrayList<>();
        title.add("принцесса");
        title.add("герцогиня");
        title.add("баронесса");
        title.add("маркиза");
        title.add("актриса");
        title.add("белошвейка");
        title.add("горничная");
        title.add("кухарка");
        title.add("пастушка");
        List<Woman> women = new ArrayList<>();
        for (String name : title) {
            women.add(new Woman(name));
        }
        return women;
    }
}
