public class Notifier implements Notification, Cloneable {
    private String name;

    public Notifier(String name) {
        this.name = name;
    }

    // @Override ?
    public void inform() {              
        People.setNotificationPercentage(
            People.getNotificationPercentage() + Math.random() * 0.1 + 0.9);
    }

    void work() {
        System.out.print("оповестить: ");
    }

    @Override
    public Notifier clone() throws CloneNotSupportedException {
        Notifier obj = (Notifier) super.clone();
        obj.name = new String(this.name); // зачем?
        return obj;
    }
}
