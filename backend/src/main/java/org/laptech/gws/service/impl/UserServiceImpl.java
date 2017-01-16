package org.laptech.gws.service.impl;

import org.laptech.gws.data.User;
import org.laptech.gws.data.dao.UserDAO;
import org.laptech.gws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rlapin
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean removeUser(User user) {
        return false;
    }

    @Override
    public User getUser(String login, String password) {
        return null;
    }
}
