import Additional.Creation;
import Additional.Decree;
import Additional.Action;
import Humanoid.Woman;
import Humanoid.People;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Creation.king.take(Creation.ring);
        People.setHumans(Creation.humans);
        Creation.king.getDecree().add(new Decree("та девушка, на пальчик которой наденется золотое " +
                Creation.ring.name() + ", станет невестой " + Creation.prince.getName() + ". "));
        Action.informing(100, new ArrayList<>(Arrays.asList(Creation.notifier)));
        System.out.print(Creation.king.getDecree().get(0).getName());
        System.out.print("Пришли: ");
        for (Woman woman : Creation.women) {
            System.out.print(woman.getName() + ", ");
        }
        RandomGenerator rand = RandomGenerator.getDefault();
        int count = rand.nextInt(4, 8);
        for (int i = 1; i <= count; i++) {
            Creation.elected.addAll(Action.fitting(Creation.women, Creation.ring));
        }

        System.out.print("и попытались одеть кольцо");
        if (Creation.elected.size() == 0) {
            System.out.println(". Никто из них не смог. ");

        } else if (Creation.elected.size() == 1) {
            System.out.print(". У одной из них получилось! ");
            Action.wedding(Creation.elected.get(0), Creation.prince, Creation.ring);
        } else {
            System.out.print(". Некоторые из них смогли: ");
            for (Woman woman : Creation.elected) {
                System.out.print(woman.getName() + ", ");
            }
        }
        System.out.println();
    }
}

