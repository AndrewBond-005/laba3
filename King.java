import java.util.ArrayList;

public class King {
    private Object objectInHand;
    private ArrayList<Decree> decree = new ArrayList<>();

    void take(Ring ring) {
        this.objectInHand = ring;
        System.out.print("Король взял " + ring.name() + " ");
    }

    public Object getObjectInHand() {
        return objectInHand;
    }

    public void setDecree(ArrayList<Decree> decree) {
        this.decree = decree;
    }

    public ArrayList<Decree> getDecree() {
        return decree;
    }

    ArrayList<Notifier> send(int count, ArrayList<String> arrayList) throws CloneNotSupportedException {
        ArrayList<Notifier> list = new ArrayList<>();
        System.out.print("разослал " + count + " ");
        for (String name : arrayList) {
            Notifier notifier = new Notifier(name);
            for (int i = 1; i <= count; i++) {
                list.add(notifier.clone());
                if (i == 1) {
                    System.out.print(name + ", ");
                }
            }
        }
        return list;
    }
}
