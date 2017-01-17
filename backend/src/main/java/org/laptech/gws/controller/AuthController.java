package org.laptech.gws.controller;

import org.laptech.gws.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rlapin
 */
@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    //TODO change insecure password transfer
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("login") String login,@RequestParam("password") String password){
        return authService.login(login,password);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam("login") String login,@RequestParam("password") String password){
        return authService.register(login,password);
    }

}
