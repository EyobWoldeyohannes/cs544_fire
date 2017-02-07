package com.cs544.fire.timesheet.controller;

import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.service.StudentService;
import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by eyob on 2/6/17.
 */

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(Student student, Model model) {
        studentService.addStudent(student);
        //request.getSession().setAttribute("successMessage", "Profile successfully updated");
        return "redirect:/";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String getStudent( Model model) {
        return "addStudent";
    }


}
