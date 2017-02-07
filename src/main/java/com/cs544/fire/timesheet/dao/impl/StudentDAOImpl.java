package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.StudentDAO;
import com.cs544.fire.timesheet.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */

@Repository("studentDAO")
public class StudentDAOImpl extends GenericDAOImpl <Student> implements StudentDAO{

    public List<Student> getAll(){

        return null;

    }
}
