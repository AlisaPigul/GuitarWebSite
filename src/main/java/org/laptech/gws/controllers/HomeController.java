package org.laptech.gws.controllers;

import org.laptech.gws.data.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rlapin on 12/12/16.
 */
@Controller
public class HomeController {

    @Autowired
    UserInfo userInfo;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        if(!userInfo.isLogged()){
            return "redirect:/signup";
        }
        return "index";
    }

}
