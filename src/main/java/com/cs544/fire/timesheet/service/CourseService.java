package com.cs544.fire.timesheet.service;

import com.cs544.fire.timesheet.model.Course;
import com.cs544.fire.timesheet.model.Student;

import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */
public interface CourseService {

    public void addCourse(Course course);

    public List<Course> getAllCourse();
    public Course getCourse(String id);
    public void updateCourses(String id, Course course);
}
