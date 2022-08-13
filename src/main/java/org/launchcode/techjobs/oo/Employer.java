package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public Employer() {
        super();
        super.getId();
    }

    public Employer(String aValue) {
        super(aValue);
        this.setValue(aValue);
    }

    // Custom toString, equals, and hashCode methods:
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId());
    }

//     Getters and Setters:
    public int getId() {
        return super.getId();
    }

    public String getValue() {
        return super.getValue();
    }

    public String setValue(String aValue) {
       return super.setValue(aValue);
    }

    @Override
    public String toString() {
        return super.getValue();
    }

}
