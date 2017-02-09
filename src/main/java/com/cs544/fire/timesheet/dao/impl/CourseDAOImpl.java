package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.CourseDAO;
import com.cs544.fire.timesheet.model.Course;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

    /**
     * Created by Abel on 2/5/2017.
     */

    @Repository("courseDAO")
    public class CourseDAOImpl extends GenericDAOImpl <Course> implements CourseDAO{
        @Autowired
        protected SessionFactory sessionFactory;

        public List<Course> getAll(){

            Query query = sessionFactory.getCurrentSession().createQuery("from Course");

            return (List<Course>)query.list();

        }

        public Course get(String id){
            Query q = sessionFactory.getCurrentSession().createQuery(" select c from Course c where c.courseId = :cid");
            q.setParameter("cid",id);

            return (Course)q.list().get(0);
        }
    }




