package com.cs544.fire.timesheet.dao;

import com.cs544.fire.timesheet.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */


public interface StudentDAO extends GenericDAO<Student> {

    List<Student> getAll();
    public List<Student> getStudentById(String studentid);

    public boolean getStudentAttendance(String locactionid, String studentid, String timeslot, Date date );

}
