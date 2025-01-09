package Humanoid;
import Additional.Decree;
import Additional.Ring;
import Interfaces.Marriageable;

import java.util.Objects;

public class Woman extends Human implements Marriageable {
    private String fingerSize;
    private Prince husband = null;
    private String name;
    private Ring ring;
    private Decree theLastRecognizedDecree;

    public Woman(String name, String fingerSize) {
        this.name = name;
        this.fingerSize = fingerSize;
    }

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void marry(Human husband) {
        try {
            this.husband = (Prince) husband;
            System.out.print(this.getName() + " выходит замуж за ");
        } catch (ClassCastException e) {
            System.out.println("Попытка привести объект к типу, несовместимому с его фактическим типом");
        }
    }

    public void FindOutTheDecree(Decree decree) {
        theLastRecognizedDecree = decree;
    }

    public Ring getRing() {
        return ring;
    }

    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public Decree getLastRecognizedDecree() {
        return theLastRecognizedDecree;
    }

    public void setLastRecognizedDecree(Decree decree) {
        this.theLastRecognizedDecree = decree;
    }

    public String getFingerSize() {
        return fingerSize;
    }

    public void setFingerSize(String fingerSize) {
        this.fingerSize = fingerSize;
    }

    public Human getHusband() {
        return husband;
    }

    public void setHusband(Prince husband) {
        this.husband = husband;
    }

    public String getName() {
        return this.name;
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
        final Woman other = (Woman) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.fingerSize, other.fingerSize)) {
            return false;
        }
        return Objects.equals(this.husband, other.husband);
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



