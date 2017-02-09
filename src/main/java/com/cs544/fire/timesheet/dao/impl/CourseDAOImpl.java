package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.CourseDAO;
import com.cs544.fire.timesheet.dao.impl.GenericDAOImpl;
import com.cs544.fire.timesheet.model.Course;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

    /**
     * Created by Abel on 2/5/2017.
     */

    @Repository("courseDAO")
    @Transactional(propagation = Propagation.MANDATORY)
    public class CourseDAOImpl extends GenericDAOImpl<Course> implements CourseDAO{
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
        public boolean delete(String id){
            System.out.println("*********************id inside daoimpl*********"+id);

            Query q1 = sessionFactory.getCurrentSession().createQuery(" update CourseOffering c set c.courseid = null where c.courseid.courseId = :cid");
            q1.setParameter("cid",id);
            int r = q1.executeUpdate();
            System.out.println("**************update null**********: "+ r);
            Query q = sessionFactory.getCurrentSession().createQuery(" delete from Course  c where c.courseId = :cid");
             q.setParameter("cid",id);
            //q.setString("cid",id);
             r=q.executeUpdate();
            System.out.println("delete result is: "+r);

            if(r>0)
                 return true;

              return  false;

        }

    }




