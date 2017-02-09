package com.cs544.fire.timesheet.dao;

import com.cs544.fire.timesheet.model.CSession;
import com.cs544.fire.timesheet.model.Student;

import java.util.List;

/**
 * Created by Abel on 2/5/2017.
 */


public interface CSessionDAO extends GenericDAO<CSession> {

    List<CSession> getAll();
    List<CSession> getSessionByCourseOffering(String offID);

}
