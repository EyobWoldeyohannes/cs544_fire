package com.cs544.fire.timesheet.controller;

import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

/**
 * Created by eyob on 2/6/17.
 */

@Controller
@Transactional
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public String addStudent(Student student, Model model) {
        studentService.addStudent(student);
        //request.getSession().setAttribute("successMessage", "Profile successfully updated");
        return "redirect:/student/list";
    }
    @RequestMapping(value = "/student/edit/{id}", method = RequestMethod.POST)
    public String editStudent(Student student, @PathVariable long id, Model model) {
        studentService.updateStudents(id,student);
        //request.getSession().setAttribute("successMessage", "Profile successfully updated");
        return "redirect:/student/list";
    }
    @RequestMapping(value = "/student/edit/{id}", method = RequestMethod.GET)
    public String editStudentForm(@PathVariable long id,  Model model) {
        Student student=studentService.getStudent(id);
        model.addAttribute("student",student);
        return "editStudent";
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.GET)
    public String getStudentForm( Model model) {

        return "addStudent";
    }

    @RequestMapping(value = "/student/list", method = RequestMethod.GET)
    public String getAllStudent( Model model) {

        List<Student> students=studentService.getAllStudents();
        model.addAttribute("students",students);
        return "studentsList";
    }
}
