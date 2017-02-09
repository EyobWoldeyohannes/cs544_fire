package com.cs544.fire.timesheet.service;

import com.cs544.fire.timesheet.model.CSession;
import com.cs544.fire.timesheet.model.CourseOffering;
import org.springframework.ui.Model;


import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */
public interface CSessionService {

    public void addCSession(CSession csession, String startdate, String enddate, String CourseOfferingId);
    public List<CSession> getAllCSession();
    public CSession getCSession(long id);
    public void updateCSession(long id, CSession csession);
    public List<CSession> getSessionByCourseOffering(String offID);
}
