package org.laptech.gws.data.repositories;

import org.laptech.gws.data.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author rlapin on 12/13/16.
 */
@Component
public class SimpleUserRepository implements UserRepository{
    Set<User> users = new HashSet<>();
    @Override
    public List<User> findUsers() {
        return users.stream().collect(Collectors.toList());
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
