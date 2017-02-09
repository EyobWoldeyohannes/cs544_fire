package com.cs544.fire.timesheet.service.impl;

import com.cs544.fire.timesheet.dao.CourseDAO;
import com.cs544.fire.timesheet.model.Course;
import com.cs544.fire.timesheet.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    /**
     * Created by eyob on 2/6/17.
     */

    @Service("courseService")
    public class CourseServiceImpl implements CourseService {

        @Autowired
        CourseDAO courseDAO;

        public void addCourse(Course course) {

            courseDAO.add(course);

        }

        public List<Course> getAllCourse() {

            return courseDAO.getAll();

        }

        public void updateCourses(String id,Course course){
            Course course_new=courseDAO.get(id);
            course_new.setCourseId(course.getCourseId());
            course_new.setCoursenName(course.getCoursenName());
            course_new.setDescription(course.getDescription());
            courseDAO.update(course_new);

        }
        public Course getCourse(String id){
            return courseDAO.get(id);
        }
    }


