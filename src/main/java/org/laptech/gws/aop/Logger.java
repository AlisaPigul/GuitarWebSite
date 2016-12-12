package org.laptech.gws.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author rlapin on 12/13/16.
 */

@Aspect
@Component
public class Logger {

    @After("execution(String org.laptech.gws.controllers.HomeController.other(..))")
    public void logger(){
        System.out.println("REDIRECT");
    }


    @AfterReturning("execution(* org.laptech.gws.data.repositories.*.*(..)) && args(obj)")
    public void logData(Object obj){
        System.out.println(obj);
    }

}
