package com.cs544.fire.timesheet.service;

import com.cs544.fire.timesheet.model.Student;

import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */
public interface StudentService {

    public void addStudent(Student student);

    public List<Student> getAllStudents();
    public Student getStudent(long id);
    public void updateStudents(long id,Student student);
}
