package com.cs544.fire.timesheet.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    @NotEmpty(message = "Student ID is required")

    @Pattern(regexp="\\d{3}[-]\\d{2}[-]\\d{4}", message="Student ID should be in 000-00-0000 format")
    private String studentID;
    @NotEmpty(message = "Student First Name is required")
    private String firstName;
    @NotEmpty(message = "Student Last Name is required")
    private String lastName;
    @NotEmpty(message = "Student Barcode is required")
    private String barCode;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentID='" + studentID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", barCode='" + barCode + '\'' +
                '}';
    }

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
