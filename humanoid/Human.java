package humanoid;

import additional.Decree;

import java.util.Objects;

public abstract class Human {
    public String name = "";
    public int age;
    public Gender gender;
    public int height;
    public int weight;
    private Decree theLastRecognizedDecree;

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        int hash = 79;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public abstract String toString();


}

