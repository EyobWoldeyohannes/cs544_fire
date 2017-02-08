package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.StudentDAO;
import com.cs544.fire.timesheet.model.Student;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */

@Repository("studentDAO")
public class StudentDAOImpl extends GenericDAOImpl <Student> implements StudentDAO{
    @Autowired
    protected SessionFactory sessionFactory;

    public List<Student> getAll(){

        Query query = sessionFactory.getCurrentSession().createQuery("from Student");

        return (List<Student>)query.list();

    }

    public List<Student> getStudentById(String studentid){

        Query query = sessionFactory.getCurrentSession().createQuery("from Student s where studentID=:sid");
        query.setParameter("sid",studentid);
        List<Student> student = (List<Student>)query.list();

            return student;


    }


    @Override
    public Student get(long id){

        Query query = sessionFactory.getCurrentSession().createQuery("from Student s where s.id="+id);

        return (Student)query.list().get(0);

    }
}
