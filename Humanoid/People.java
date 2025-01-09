package Humanoid;

import java.util.ArrayList;
import java.util.List;

public final class People {
    private static double notificationPercentage = 0;
    private static List<Human> humans = new ArrayList<>();

    public static List<Human> getHumans() {
        return humans;
    }

    public static void setHumans(List<Human> h) {
        humans = h;
    }

    public static double getNotificationPercentage() {
        return notificationPercentage;
    }

    public static void setNotificationPercentage(double notificationPercentage) {
        People.notificationPercentage = notificationPercentage;
    }

}
