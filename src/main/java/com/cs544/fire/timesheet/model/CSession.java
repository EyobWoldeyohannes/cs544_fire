package com.cs544.fire.timesheet.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class CSession {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="offeringId")
    private CourseOffering courseOffering;

    @ManyToOne
    @JoinColumn(name = "timeslotId")
    private Timeslot timeslot;

    private Date date;

    public CSession(){

    }

    public long getId() {
        return id;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
