package org.laptech.gws.service.impl;

import org.laptech.gws.data.entities.User;
import org.laptech.gws.data.entities.repository.UserRepository;
import org.laptech.gws.exceptions.IncorrectPasswordException;
import org.laptech.gws.exceptions.UserAlreadyExistsException;
import org.laptech.gws.exceptions.UserNotExistsException;
import org.laptech.gws.service.AuthService;
import org.laptech.gws.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @author rlapin
 */
@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    UserRepository userRepository;

    @Override
    public String login(String login, String password) {
        User user = userRepository.getUserByLogin(login);
        if(user==null){
            throw new UserNotExistsException();
        }
        if(user.getPassword()!=null && Arrays.equals(user.getPassword(), doDigest(password))){
            return JWTUtils.generateJWT(user);
        }
        throw new IncorrectPasswordException();
    }


    @Override
    public String register(String login, String password) {
        if(userRepository.getUserByLogin(login) != null) throw new UserAlreadyExistsException();
        User user = new User();
        user.setLogin(login);
        user.setPassword(doDigest(password));
        userRepository.save(user);
        return JWTUtils.generateJWT(user);
    }



    private byte[] doDigest(String password) {
        try {
            byte[] inputBytes = password.getBytes("UTF-8");
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return md5.digest(inputBytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e.toString());
        }
    }


}
