package com.cs544.fire.timesheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Abel on 2/5/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
