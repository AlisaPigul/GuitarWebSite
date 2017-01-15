package org.laptech.gws.controller;

import org.laptech.gws.data.User;
import org.laptech.gws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rlapin
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
