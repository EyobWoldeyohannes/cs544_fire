package com.cs544.fire.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private long id;


    private double GPA;
    public Registration(){

    }
    public long getId() {
        return id;
    }
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

}
