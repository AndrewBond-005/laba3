public class Woman extends Human {
    private Size fingerSize;
    private Prince husband = null;
    private String name;

    public boolean tryOn(Ring ring) {
        return this.getFingerSize().getMaxSize() <= ring.size().getMaxSize();
    }

    @Override
    public void marry(Human husband) {
        try {
            this.husband = (Prince) husband;
        } catch (ClassCastException e) {
            System.out.println("Попытка привести объект к типу, несовместимому с его фактическим типом");
        }
        System.out.print(this.getName() + " выходит замуж за ");
    }

    public Woman(String name, Size fingerSize) {
        this.name = name;
        this.fingerSize = fingerSize;
    }

    public Size getFingerSize() {
        return fingerSize;
    }

    public Human getHusband() {
        return husband;
    }

    public String getName() {
        return this.name;
    }

    public void setFingerSize(Size fingerSize) {
        this.fingerSize = fingerSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Prince husband) {
        this.husband = husband;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Woman other = (Woman) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.fingerSize == null) ? (other.fingerSize != null) : !this.fingerSize.equals(other.fingerSize)) {
            return false;
        }
        if ((this.husband == null) ? (other.husband != null) : !this.husband.equals(other.husband)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.husband != null ? this.husband.hashCode() : 0);
        hash = 79 * hash + (this.fingerSize != null ? this.fingerSize.hashCode() : 0);
        return hash;
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



