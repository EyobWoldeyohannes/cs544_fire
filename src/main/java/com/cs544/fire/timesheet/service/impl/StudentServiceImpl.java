package com.cs544.fire.timesheet.service.impl;

import com.cs544.fire.timesheet.dao.StudentDAO;
import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    public void addStudent(Student student) {

        studentDAO.add(student);

    }

    public List<Student> getAllStudents() {

        return studentDAO.getAll();

    }

    public void updateStudents(long id,Student student){
        Student student_new=studentDAO.get(id);
        student_new.setStudentID(student.getStudentID());
        student_new.setFirstName(student.getFirstName());
        student_new.setLastName(student.getLastName());
        student_new.setBarCode(student.getBarCode());
        studentDAO.update(student_new);

    }
    public Student getStudent(long id){
        return studentDAO.get(id);
    }


    public List<Student> getStudentById(String studentid)
    {
        return studentDAO.getStudentById(studentid);
    }
    public boolean getStudentAttendance(String locactionid, String studentid, String timeslot, Date date )
    {
        return  studentDAO.getStudentAttendance(locactionid,studentid,timeslot,date);
    }
}
