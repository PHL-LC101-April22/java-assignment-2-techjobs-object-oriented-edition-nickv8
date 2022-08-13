package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency() {
        super();
    }


    public CoreCompetency(String aValue) {
        super(aValue);
        this.setValue(aValue);
    }

    // Custom toString, equals, and hashCode methods:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

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
