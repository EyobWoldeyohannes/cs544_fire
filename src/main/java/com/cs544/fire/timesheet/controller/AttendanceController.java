package com.cs544.fire.timesheet.controller;

import com.cs544.fire.timesheet.model.*;
import com.cs544.fire.timesheet.service.SessionService;
import com.cs544.fire.timesheet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Abel on 2/8/2017.
 */

@Controller
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AttendanceController {
    @Autowired
    StudentService studentService;

    @Autowired
    SessionService sessionService;

    @RequestMapping(value = "/student/attendance", method = RequestMethod.POST)
    public String getStudentAttendance(String studentid, String offeringid, Model model) {

        List<Student> students=studentService.getStudentById(studentid);
        List<CSession> sessions=sessionService.getSessionByCourseOffering(offeringid);

        model.addAttribute("studentid",studentid);
        model.addAttribute("csession",sessions);

        System.out.println( students.get(0).getRegistrations().get(0).getCourseOfferings().getCourseid().getCoursenName() );

        if (students.size()>0)
        {
            List<CourseOffering> courseOfferings =new ArrayList<CourseOffering>();
            List<Boolean> attendance =new ArrayList<Boolean>();
            for (Registration reg : students.get(0).getRegistrations())
            {
                courseOfferings.add(reg.getCourseOfferings());

            }
            model.addAttribute("courseOfferings",courseOfferings);


        }

        List<tempAtt> attendance =new ArrayList<tempAtt>();
        for (CSession sess : sessions)
        {
            Boolean flag=studentService.getStudentAttendance("DB",students.get(0).getBarCode(),sess.getTimeslot().getAbbrv(),sess.getDate());

            tempAtt tempAtt=new tempAtt();

            tempAtt.sessiondate=sess.getDate();
            tempAtt.offeringid=sess.getCourseOffering().getCourseOfferingId();
            tempAtt.timeslot=sess.getTimeslot().getDescription();
            tempAtt.attendance=flag;

            attendance.add(tempAtt);
        }
        model.addAttribute("tempSession",attendance);








        model.addAttribute("students",students);
        return "attendanceList";
    }

    @RequestMapping(value = "/student/attendance", method = RequestMethod.GET)
    public String getStudentAttendanceForm() {

        return "attendanceList";
    }


}


