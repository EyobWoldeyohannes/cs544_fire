package com.cs544.fire.timesheet.controller;

import com.cs544.fire.timesheet.model.CSession;
import com.cs544.fire.timesheet.model.CourseOffering;
import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.service.CSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */

@Controller
@Transactional
public class CSessionController {
    @Autowired
    CSessionService csessionService;

    @RequestMapping(value = "/csession/add", method = RequestMethod.POST)
    public String addStudent(CSession csession, String startdate, String enddate, String CourseOfferingId, Model model) {
        csessionService.addCSession(csession,startdate, enddate, CourseOfferingId);
        //request.getSession().setAttribute("successMessage", "Profile successfully updated");
        return "redirect:/csession/list";
    }
    @RequestMapping(value = "/csession/edit/{id}", method = RequestMethod.POST)
    public String editStudent(CSession csession, @PathVariable long id, Model model) {
        csessionService.updateCSession(id,csession);
        //request.getSession().setAttribute("successMessage", "Profile successfully updated");
        return "redirect:/student/list";
    }
    @RequestMapping(value = "/csession/edit/{id}", method = RequestMethod.GET)
    public String editStudentForm(@PathVariable long id,  Model model) {
        CSession csession=csessionService.getCSession(id);
        model.addAttribute("csession",csession);
        return "editCSession";
    }

    @RequestMapping(value = "/csession/add", method = RequestMethod.GET)
    public String getStudentForm( Model model) {

        return "addCSession";
    }

    @RequestMapping(value = "/csession/list", method = RequestMethod.GET)
    public String getAllCSession( Model model) {

        List<CSession> csessions=csessionService.getAllCSession();
        model.addAttribute("csessions",csessions);
        return "csessionList";
    }

}
