package org.laptech.gws.data.dao;

import org.laptech.gws.data.User;

import java.util.List;
import java.util.Optional;

/**
 * UserDAO
 * @author rlapin on 12/13/16.
 */
public interface UserDAO {
    List<User> getUsers();

    void addUser(User user);

    Optional<User> getUser(String login);
}
