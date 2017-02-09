package com.cs544.fire.timesheet.service.impl;

import com.cs544.fire.timesheet.dao.SessionDAO;
import com.cs544.fire.timesheet.model.CSession;
import com.cs544.fire.timesheet.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfAuthenticationStrategy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Abel on 2/8/2017.
 */
@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    SessionDAO sessionDAO;

    public List<CSession> getSessionByCourseOffering(String offID)
    {
        return sessionDAO.getSessionByCourseOffering(offID);
    }
}
