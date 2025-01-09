package Additional;

import Humanoid.Notifier;
import Humanoid.Prince;
import Humanoid.Woman;

import java.util.ArrayList;
import java.util.List;

public final class Action {

    public static void wedding(Woman woman, Prince prince, Ring ring) {
        woman.marry(prince);
        prince.marry(woman);
        woman.setRing(ring);
        System.out.print(prince.getName());
    }

    public static List<Woman> fitting(List<Woman> women, Ring ring) {
        List<Woman> elected = new ArrayList<>();
        for (Woman woman : women) {
            double sizeOfFinger = (double) ((int) (Math.random() * 10)) / 2 +
                    ((woman.getName().equals("принцесса")) ? 14.5 : 15);//14.5-20
            Size size = FindSize.findSize(sizeOfFinger);
            try {
                woman.setFingerSize(size.name());

            } catch (NullPointerException e) {
                System.out.println("	Недопустимое использование пустой ссылки");
            }
            if (ring.tryToGetDressed(woman)) {
                elected.add(woman);
            }
        }
        return elected;
    }

    public static void informing(int count, ArrayList<String> notifiers) {
        try {
            Creation.notifiers = Creation.king.send(count, notifiers);
        } catch (CloneNotSupportedException e) {
            System.out.println("Попытка клонирования объекта, не реализующего интерфейс Cloneable");
        }
        for (Notifier n : Creation.notifiers) {
            n.inform();
        }
        try {
            Creation.notifiers.get(0).work(Creation.king.getDecree().getLast());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива!");
        }
    }
}
