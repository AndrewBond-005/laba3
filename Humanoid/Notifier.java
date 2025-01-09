package Humanoid;

import Interfaces.Notificationable;
import Additional.Decree;

public class Notifier implements Notificationable, Cloneable {
    private final String name;

    public Notifier(String name) {
        this.name = name;
    }

    @Override
    public void inform() {
        People.setNotificationPercentage(People.getNotificationPercentage() + 0.5);
    }

    public void work(Decree decree) {
        for (int i = 0; i < (People.getNotificationPercentage() * People.getHumans().size()) / 100; i++) {
            ((Woman) People.getHumans().get(i)).setLastRecognizedDecree(decree);
        }
        System.out.print("оповестить: ");
    }

    @Override
    public Notifier clone() throws CloneNotSupportedException {
        Notifier obj = (Notifier) super.clone();
        //obj.name = new String(this.name);
        return obj;
    }
}
