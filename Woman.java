import java.util.Objects;

public class Woman extends Spouse {
    private Size fingerSize;
    private Prince husband = null;
    private String name = "девушка";

    public Woman() { // зачем?
    };

    boolean tryOn(Ring ring) {
        return this.getFingerSize().getMaxSize() <= ring.size().getMaxSize();
    }

    @Override
    void marry(Spouse husband) {
        try {
            this.husband = (Prince) husband;
        } catch (ClassCastException e) {
            System.out.println("Попытка привести объект к типу, несовместимому с его фактическим типом");
        }
        System.out.print(this.getName() + " выходит замуж за ");
    }

    Woman(String name, Size fingerSize) { // почему нет модификатора доступа? 
        this.name = name;
        this.fingerSize = fingerSize;
    }
    
    /* --- */
    public Size getFingerSize() {
        return fingerSize;
    }

    public Spouse getHusband() {
        return husband; 
    }

    String getName() { // модификатор доступа?
        return this.name;
    }
    /* --- и все таки, как к переменным обращатся?  */

    public void setFingerSize(Size fingerSize) {
        this.fingerSize = fingerSize;
    }

    public void setHusband(Spouse husband) {
        this.husband = (Prince) husband;
    }

    void setName(String name) {
        this.name = name;
    }

    /* сгенерированный код 👇 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Woman woman = (Woman) obj;
        return this.fingerSize == woman.fingerSize && Objects.equals(this.husband, woman.husband)
                && Objects.equals(this.name, woman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerSize, husband, name);
    }

    @Override
    public String toString() {
        return "Woman{" +
                "fingerSize=" + fingerSize +
                ", husband=" + husband +
                ", name='" + name +
                '}';
    }
}
