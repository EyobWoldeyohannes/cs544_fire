package com.cs544.fire.timesheet.dao;

import com.cs544.fire.timesheet.model.CSession;

import java.util.List;

/**
 * Created by Abel on 2/8/2017.
 */
public interface SessionDAO extends GenericDAO<CSession> {

    public List<CSession> getSessionByCourseOffering(String offID);

}
