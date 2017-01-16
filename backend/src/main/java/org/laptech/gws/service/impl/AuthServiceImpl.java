package org.laptech.gws.service.impl;

import org.laptech.gws.data.User;
import org.laptech.gws.data.dao.UserDAO;
import org.laptech.gws.exceptions.UserAlreadyExistsException;
import org.laptech.gws.exceptions.UserNotExistsException;
import org.laptech.gws.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author rlapin
 */
@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    UserDAO userDAO;

    @Override
    public String login(String login, String password) {
        User user = userDAO.getUser(login).orElseThrow(UserNotExistsException::new);
        if(user.getPassword()!=null && user.getPassword().equals(doDigest(password))){

        }
        return null;
    }




    @Override
    public String register(String login, String password) {
        if(userDAO.getUser(login).isPresent()) throw new UserAlreadyExistsException();
        User user = new User();
        user.setLogin(login);
        user.setPassword(doDigest(password));
        userDAO.addUser(user);
        return "";
    }



    private String doDigest(String password) {
        try {
            byte[] inputBytes = password.getBytes("UTF-8");
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return new String(md5.digest(inputBytes),"UTF-8");
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e.toString());
        }
    }


}
