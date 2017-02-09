package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.CSessionDAO;
import com.cs544.fire.timesheet.model.CSession;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */

@Repository("csessionDAO")
public class CSessionDAOImpl extends GenericDAOImpl <CSession> implements CSessionDAO{
    @Autowired
    protected SessionFactory sessionFactory;

    public List<CSession> getAll(){

        Query query = sessionFactory.getCurrentSession().createQuery("from CSession");

        return (List<CSession>)query.list();

    }
    public List<CSession> getSessionByCourseOffering(String offID)
    {
        Query query = sessionFactory.getCurrentSession().createQuery("from CSession s where s.courseOffering.courseOfferingId= :id");
        query.setParameter("id",offID);
        List<CSession> cSessions = (List<CSession>)query.list();

        return cSessions;
    }
}
