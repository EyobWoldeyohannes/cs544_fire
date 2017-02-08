package com.cs544.fire.timesheet.service.impl;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


/**
 * Created by ET on 2/7/2017.
 */
@Aspect
@Component
public class LoggerAspect {

        @After("execution (* com.cs544.fire.timesheet.dao.*.*(..))")
        public void LoggingAdvice(JoinPoint joinPoint){
            String str="A method "+ joinPoint.getSignature().getName()+"is called";
         //   java.util.logging.Logger.getLogger("Dao Logger").info(str);
            System.out.println(str);

        }
    @AfterReturning(pointcut = "execution (* com.cs544.fire.timesheet.dao.*.*(..))",returning="retval")
    public void returningAdvice(JoinPoint joinPoint,Object retval){
        String str="A method "+ joinPoint.getSignature().getName()+" is called and "+" makes a change ->"+retval.toString();
         Logger.getLogger("Dao Logger").info(str);
//        System.out.println(str);
//        System.out.println("-----"+retval.toString());


    }

}
