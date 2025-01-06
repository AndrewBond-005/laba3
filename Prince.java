import java.util.Objects;

public class Prince extends Human {
    private Woman wife = null;
    private String name;

    public Prince(String name) {
        this.name = name;
    }

    @Override
    public void marry(Human wife) {
        this.wife = (Woman) wife;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Prince other = (Prince) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.wife == null) ? (other.wife != null) : !this.wife.equals(other.wife)) {
            return false;
        }
        return true;
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
