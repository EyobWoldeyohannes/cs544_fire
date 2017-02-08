package com.cs544.fire.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class Course {
    @Id
    private String courseId;
    private String coursenName;

    @Lob
    private  String description;


    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCoursenName() {
        return coursenName;
    }

    public void setCoursenName(String coursenName) {
        this.coursenName = coursenName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
