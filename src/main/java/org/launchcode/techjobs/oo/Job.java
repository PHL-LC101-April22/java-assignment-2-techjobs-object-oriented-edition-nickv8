package org.launchcode.techjobs.oo;

import com.sun.jdi.Value;

import org.launchcode.techjobs.oo.Employer;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

@Override
    public String toString() {
        //bonus
        if (name == "" && employer.getValue() == "" && location.getValue() == "" && positionType.getValue() == "" && coreCompetency.getValue() == ""){
            return "OOPS! This job does not seem to exist.";
        }
        if (name == "") {
            this.name = "Data not available";
        }
        if (employer.getValue() == "") {
           employer.setValue("Data not available");

        }
        if (location.getValue() =="") {
           location.setValue("Data not available");
        }
        if (positionType.getValue() =="") {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() =="") {
            coreCompetency.setValue("Data not available");
        }

           return "\n" + "ID: " + this.id + "\nName: " + this.name + "\nEmployer: " + this.employer.getValue() + "\nLocation: "
                   + this.location + "\nPosition Type: " + this.positionType + "\nCore Competency: " + this.coreCompetency + "\n";
        }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
