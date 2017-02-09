package com.cs544.fire.timesheet.service.impl;

import com.cs544.fire.timesheet.dao.CSessionDAO;
import com.cs544.fire.timesheet.dao.StudentDAO;
import com.cs544.fire.timesheet.model.CSession;
import com.cs544.fire.timesheet.model.CourseOffering;
import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.model.Timeslot;
import com.cs544.fire.timesheet.service.CSessionService;
import com.cs544.fire.timesheet.service.StudentService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */

@Service("csessionService")
public class CSessionServiceImpl implements CSessionService {

    @Autowired
    CSessionDAO csessionDAO;
    public List<CSession> getSessionByCourseOffering(String offID)
    {
        return csessionDAO.getSessionByCourseOffering(offID);
    }



    public void addCSession(CSession csession, String startdate, String enddate,String CourseOfferingId) {
       // CourseOffering courseOffering = courseOfferingDAO.get(CourseOfferingId);
      //  System.out.print("----------------------"+courseOffering.toString());

        CSession cs = new CSession();
        String str_date = startdate;
        String end_date = enddate;
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate1;
        Date endDate1;

         try {
            startDate1 = formatter.parse(str_date);
            endDate1 = formatter.parse(end_date);
             List<CSession> cSessionList= getListOfDaysBetweenTwoDates(startDate1, endDate1,CourseOfferingId);
             for(CSession csession1:cSessionList){csessionDAO.add(csession1);}
            } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }





    }

    public List<CSession> getAllCSession() {

        return csessionDAO.getAll();

    }

    public void updateCSession(long id, CSession csession) {
        CSession session_new = csessionDAO.get(id);
        session_new.setCourseOffering(csession.getCourseOffering());
        session_new.setDate(csession.getDate());
        session_new.setTimeslot(csession.getTimeslot());
        csessionDAO.update(session_new);

    }

    public CSession getCSession(long id) {
        return csessionDAO.get(id);
    }

    private static List<CSession> getListOfDaysBetweenTwoDates(Date startdate, Date enddate, String CourseOfferingId) {

        List<CSession> result = new ArrayList<CSession>();
        Calendar start = Calendar.getInstance();
        start.setTime(startdate);
        Calendar end = Calendar.getInstance();
        end.setTime(enddate);
        end.add(Calendar.DAY_OF_YEAR, 1); //Add 1 day to endDate to make sure endDate is included into the final list
        while (start.before(end)) {
            CSession csession = new CSession();
            CSession csession2 = new CSession();
            Timeslot am = new Timeslot();
            am.setAbbrv("AM");
            // CourseOffering courseOffering = courseOfferingDAO.get(CourseOfferingId);
            CourseOffering a = new CourseOffering();
            a.setCourseOfferingId(CourseOfferingId);

            Timeslot pm = new Timeslot();
            pm.setAbbrv("PM");



            Date date1 =  start.getTime();


            int dayOfWeek = start.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.SATURDAY) {

                csession.setCourseOffering(a);
                csession.setDate(date1);
                csession.setTimeslot(am);
                result.add(csession);
                start.add(Calendar.DAY_OF_YEAR, 2);
            } else if (dayOfWeek == Calendar.SUNDAY) {
                start.add(Calendar.DAY_OF_YEAR, 1);
            } else {
                csession.setCourseOffering(a);
                csession.setDate(date1);
                csession.setTimeslot(am);
                csession2.setCourseOffering(a);
                csession2.setDate(date1);
                csession2.setTimeslot(pm);
                result.add(csession);
                result.add(csession2);
                start.add(Calendar.DAY_OF_YEAR, 1);

            }

        }
        return result;
    }
}
