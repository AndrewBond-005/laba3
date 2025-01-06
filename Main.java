import java.util.ArrayList;
import java.util.Arrays;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        King king = new King();
        Ring ring = new Ring(Size.SMALL, "кольцо");
        king.take(ring);
        String notifers[] = {"барабанщики", "глашатаи"};
        ArrayList<Notifier> list = new ArrayList<>();
        try {
            list = king.send(100, new ArrayList<>(Arrays.asList(notifers)));
        } catch (CloneNotSupportedException e) {
            System.out.println("Попытка клонирования объекта, не реализующего интерфейс Cloneable");
        }
        try {
            list.get(0).work();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива!");
        }
        for (Notifier n : list) {
            n.inform();
        }
        Prince prince = new Prince("принц");
        king.getDecree().add(new Decree("та девушка, на пальчик которой наденется золотое " +
                ring.name() + ", станет невестой " + prince.getName() + ". "));
        System.out.print(king.getDecree().get(0).getName());
        ArrayList<String> title = new ArrayList<>();
        title.add("принцесса");
        title.add("герцогиня");
        title.add("баронесса");
        title.add("маркиза");
        title.add("актриса");
        title.add("белошвейка");
        title.add("горничная");
        title.add("кухарка");
        title.add("пастушка");
        System.out.print("Пришли ");
        RandomGenerator rand = RandomGenerator.getDefault();
        int count = rand.nextInt(4, 8);
        int success = 0;
        ArrayList<Woman> elected = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            for (String name : title) {
                double sizeOfFinger = (double) ((int) (Math.random() * 10)) / 2 + (name.equals(title.get(0)) ? 14.5 : 15);//14.5-20
                Size size = null;
                for (Size s : Size.values()) {
                    if (sizeOfFinger <= s.getMaxSize() && sizeOfFinger >= s.getMinSize()) {
                        size = s;
                    }
                }
                Woman woman = null;
                try {
                    woman = new Woman(name, size);
                    if (woman.tryOn(ring)) {
                        success += 1;
                        elected.add(woman);
                    }
                    if (i == 1) {
                        System.out.print(woman.getName() + ", ");
                    }
                } catch (NullPointerException e) {
                    System.out.println("	Недопустимое использование пустой ссылки");
                }
            }
        }
        // System.out.println("");
        if (success == 0) {
            System.out.println(". Никто из них не смог надеть кольцо. ");

        } else if (success == 1) {
            System.out.print(". Одной из них удалось одеть кольцо! ");
            elected.get(0).marry(prince);
            prince.marry(elected.get(0));
            System.out.print(prince.getName());

        } else {
            System.out.print(". Некоторые из них смогли надеть кольцо: ");
            for (Woman woman : elected) {
                System.out.print(woman.getName() + ", ");
            }

        }
        System.out.println("");
    }


}

