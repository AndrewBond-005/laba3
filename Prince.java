import java.util.Objects;

public class Prince extends Spouse {
    private Woman wife=null;
    private String name;
    public Prince(String name) {
        this.name = name;
    }
    @Override
    void marry(Spouse wife) { this.wife= (Woman) wife;}
    public void setName(String name) {
        this.name = name;
    }
    public void setWife(Spouse wife) {
        this.wife = (Woman)wife;
    }
    public Spouse getWife() {
        return wife;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Prince prince = (Prince) o;
        return Objects.equals(wife, prince.wife) && Objects.equals(name, prince.name);
    }
    @Override
    public String toString() {
        return "Prince{" +
                "wife=" + wife +
                ", name='" + name  +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wife, name);
    }
}
