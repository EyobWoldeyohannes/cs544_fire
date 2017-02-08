package com.cs544.fire.timesheet.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private long id;


    private double GPA;
    @OneToOne
            @JoinColumn(name="courseOffering")
    CourseOffering courseOfferings =new CourseOffering();

    public CourseOffering getCourseOfferings() {
        return courseOfferings;
    }

    public void setCourseOfferings(CourseOffering courseOfferings) {
        this.courseOfferings = courseOfferings;
    }

    public Registration(){

    }

    public void setId(long id) {
        this.id = id;
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
