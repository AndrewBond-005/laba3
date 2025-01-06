import java.util.Objects;

public abstract class Spouse {
    abstract void marry(Spouse spouse); // модификатор доступ?
    // почему сюда конструкор не засунуть? поле name все дочерние классы используют

    String name = "<-- модификатор ?";

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Spouse spouse = (Spouse) obj;
        return Objects.equals(name, spouse.name);
    }

    @Override
    public String toString() {
        return "Spouse{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
