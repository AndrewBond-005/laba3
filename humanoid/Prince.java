package humanoid;

import interfaces.Marriageable;

import java.util.Objects;

public class Prince extends Human implements Marriageable {
    private Woman wife = null;
    private String name;

    public Prince(String name) {
        this.name = name;
    }

    @Override
    public void marry(Human wife) {
        this.wife = (Woman) wife;
    }

    public Human getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Prince other = (Prince) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.wife, other.wife);
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 89 * hash + (this.wife != null ? this.wife.hashCode() : 0);
        return hash;
    }

    public String toString() {
        return "Prince{" +
                "wife=" + wife +
                ", name='" + name +
                '}';
    }


}
