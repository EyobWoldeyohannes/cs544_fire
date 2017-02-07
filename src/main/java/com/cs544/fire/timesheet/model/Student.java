package com.cs544.fire.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String studentID;
    private String firstName;
    private String lastName;
    private String barCode;

    public Student(){

    }

    public Student(String studentID, String firstName, String lastName, String barCode) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.barCode = barCode;
    }

    public long getId() {
        return id;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
