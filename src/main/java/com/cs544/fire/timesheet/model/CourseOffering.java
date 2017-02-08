package com.cs544.fire.timesheet.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Abel on 2/5/2017.
 */

@Entity
public class CourseOffering {
    @Id
    private String courseOfferingId;

    @ManyToOne
    @JoinColumn(name="course_Id")
    private Course courseid;

    private Date startDate;
    private Date endDate;



    public Course getCourseid() {
        return courseid;
    }

    public void setCourseid(Course courseid) {
        this.courseid = courseid;
    }

    public String getCourseOfferingId() {
        return courseOfferingId;
    }

    public void setCourseOfferingId(String courseOfferingId) {
        this.courseOfferingId = courseOfferingId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}
