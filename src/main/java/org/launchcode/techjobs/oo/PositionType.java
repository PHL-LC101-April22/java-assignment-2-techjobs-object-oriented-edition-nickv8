package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType() {
        super();
    }

    public PositionType(String aValue) {
        super(aValue);
        super.setValue(aValue);
    }


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType position = (PositionType) o;
        return getId() == position.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getId());
    }



//     Getters and Setters:
    @Override
    public int getId() {
        return super.getId();
    }

    public String getValue() {
        return super.getValue();
    }

    public String setValue(String aValue) {
        return super.setValue(aValue);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return super.getValue();
    }

}
