package com.cs544.fire.timesheet.controller;

import com.cs544.fire.timesheet.model.*;
import com.cs544.fire.timesheet.service.SessionService;
import com.cs544.fire.timesheet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abel on 2/8/2017.
 */

@Controller
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class StudentAttendanceController {
    @Autowired
    StudentService studentService;

    @Autowired
    SessionService sessionService;

    @RequestMapping(value = "/my/attendance")
    public String getStudentAttendance(String offeringid, Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String uname = auth.getName(); //get logged in username

        String studentid=studentService.getStudentByUserId(uname).get(0).getStudentID();
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
        return "attendanceListStudent";
    }

}


