package humanoid;

import additional.Decree;
import additional.Ring;

import java.util.ArrayList;
import java.util.List;

public class King extends Human {
    private Object objectInHand;
    private List<Decree> decree = new ArrayList<>();

    public void take(Ring ring) {
        this.objectInHand = ring;
        System.out.print("Король взял " + ring.name() + " ");
    }

    public Object getObjectInHand() {
        return objectInHand;
    }

    public void setObjectInHand(Object objectInHand) {
        this.objectInHand = objectInHand;
    }

    public List<Decree> getDecree() {
        return decree;
    }

    public void setDecree(ArrayList<Decree> decree) {
        this.decree = decree;
    }

    @Override
    public String toString() {
        return "King{" +
                "objectInHand=" + objectInHand +
                ", decree=" + decree +
                '}';
    }

    public ArrayList<Notifier> send(int count, List<String> arrayList) throws CloneNotSupportedException {
        List<Notifier> list = new ArrayList<>();
        System.out.print("разослал " + count + " ");
        for (String name : arrayList) {
            System.out.print(name + ", ");
        }
        for (String name : arrayList) {
            Notifier notifier = new Notifier(name);
            for (int i = 1; i <= count; i++) {
                list.add(notifier.clone());
            }
        }
        return (ArrayList<Notifier>) list;
    }


}
