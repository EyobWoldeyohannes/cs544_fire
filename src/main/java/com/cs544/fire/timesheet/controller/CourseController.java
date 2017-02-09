package com.cs544.fire.timesheet.controller;
import com.cs544.fire.timesheet.model.Course;
import com.cs544.fire.timesheet.model.Student;
import com.cs544.fire.timesheet.service.CourseService;
import com.cs544.fire.timesheet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

    /**
     * Created by eyob on 2/6/17.
     */

    @Controller
    @Transactional
    public class CourseController {
        @Autowired
        CourseService courseService;

        @RequestMapping(value = "/course/add", method = RequestMethod.POST)
        public String addCourse(@Valid @ModelAttribute("course") Course course , BindingResult bind, Model model) {
            if(bind.hasErrors()){
                return "addCourse";
            }
            courseService.addCourse(course);
            //request.getSession().setAttribute("successMessage", "Profile successfully updated");
            return "redirect:/course/list";
        }
        @RequestMapping(value = "/course/edit/{id}", method = RequestMethod.POST)
        public String editCourse(Course course, @PathVariable String id, Model model) {

            courseService.updateCourses(id,course);
            //request.getSession().setAttribute("successMessage", "Profile successfully updated");
            return "redirect:/course/list";
        }
        @RequestMapping(value = "/course/edit/{id}", method = RequestMethod.GET)
        public String editCourseForm(@PathVariable String id,  Model model) {
            Course course=courseService.getCourse(id);
            model.addAttribute("course",course);
            return "editCourse";
        }

        @RequestMapping(value = "/course/add", method = RequestMethod.GET)
        public String getCourseForm(@ModelAttribute("course") Course course) {
            return "addCourse";
        }

        @RequestMapping(value = "/course/list", method = RequestMethod.GET)
        public String getAllCourse( Model model) {

            List<Course> courses=courseService.getAllCourse();
            model.addAttribute("courses",courses);
            return "courseList";
        }
    }

