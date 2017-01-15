package org.laptech.gws.data.repositories.impl;

import org.laptech.gws.data.User;
import org.laptech.gws.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author rlapin on 12/13/16.
 */
@Component
public class SimpleUserRepository implements UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<User> getUsers() {
        jdbcTemplate.queryForList("SELECT * FROM main.users");
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}
