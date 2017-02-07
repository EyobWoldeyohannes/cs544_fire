package com.cs544.fire.timesheet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Abel on 2/7/2017.
 */

@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
}
