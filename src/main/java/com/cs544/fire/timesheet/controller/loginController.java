package com.cs544.fire.timesheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Abel on 2/7/2017.
 */
@Controller
public class loginController {


    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String errorMessage = "";
        System.out.print("Log in is pressed");
        if (request.getParameter("loginFailed") != null)
        {
            errorMessage = "Invalid login credentials";
        }

        model.addAttribute("error", errorMessage);
        return "login";

    }

}