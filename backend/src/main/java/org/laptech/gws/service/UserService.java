package org.laptech.gws.service;

import org.laptech.gws.data.entities.User;

import java.util.List;

/**
 * Service layer for interact with UserDataLayer
 * @author rlapin
 */
public interface UserService {

    List<User> getUsers();
    boolean addUser(User user);
    boolean removeUser(User user);
    User getUser(String login, String password);

}
