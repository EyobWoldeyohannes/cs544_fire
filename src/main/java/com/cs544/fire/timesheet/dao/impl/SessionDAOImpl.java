package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.SessionDAO;
import com.cs544.fire.timesheet.model.CSession;
import com.cs544.fire.timesheet.model.Student;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Abel on 2/8/2017.
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class SessionDAOImpl extends GenericDAOImpl <CSession> implements SessionDAO {

    public List<CSession> getSessionByCourseOffering(String offID)
    {
        Query query = sessionFactory.getCurrentSession().createQuery("from CSession s where offeringId=:id");
        query.setParameter("id",offID);
        List<CSession> cSessions = (List<CSession>)query.list();

        return cSessions;
    }

}
