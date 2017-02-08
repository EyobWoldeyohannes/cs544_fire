package com.cs544.fire.timesheet.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class AttendanceRecord {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="Barcode")
    private Student student;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "Timeslot")
    private Timeslot timeslot;

    @ManyToOne
    @JoinColumn(name="location")
    private Location location;

    public AttendanceRecord(){

    }

    public long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
