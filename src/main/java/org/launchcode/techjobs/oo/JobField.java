package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    //fields
    private String value;
   private int id;

   private static int nextId = 1;


    //constructors

    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String aValue){
        this();
        this.value = aValue;
    }




    //getters and setters


    public String getValue() {
        return value;
    }

    public String setValue(String value) {
        this.value = value;
        return value;
    }

    public int getId() {
        return id;
    }

    public int getNextId() {
        return nextId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



    //methods
    public abstract String toString();

}
