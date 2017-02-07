package com.cs544.fire.timesheet.service.impl;

import com.cs544.fire.timesheet.dao.StudentDAO;
import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
