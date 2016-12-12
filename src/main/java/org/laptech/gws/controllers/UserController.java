package org.laptech.gws.controllers;

import org.laptech.gws.data.User;
import org.laptech.gws.data.UserInfo;
import org.laptech.gws.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author rlapin on 12/13/16.
 */
@Controller
public class UserController {
    @Autowired
    private UserInfo userInfo;

    private UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    public String signUp(){
        return "signup";
    }

    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public String signUp(User user){
        userRepository.addUser(user);
        userInfo.setLogged(true);
        return "redirect:/";
    }



/*
    @RequestMapping(path = "/signin",method = RequestMethod.GET)
    public String getUser(Model model, @RequestParam("id") int id){
        model.addAttribute("user",userRepository.findUsers().stream().filter((u)->u.getId()==id).findFirst().orElse(null));
        return "user";
    }

    @RequestMapping(path = "/users",method = RequestMethod.GET)
    public String findUsers(Model model){
        model.addAttribute("users",userRepository.findUsers());
        return "users";
    }
*/

}
