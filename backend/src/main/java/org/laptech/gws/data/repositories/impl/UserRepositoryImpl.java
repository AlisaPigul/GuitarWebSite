package org.laptech.gws.data.repositories.impl;

import org.laptech.gws.constants.db.SqlQueries;
import org.laptech.gws.data.User;
import org.laptech.gws.data.repositories.UserRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * @author rlapin on 12/13/16.
 */
@Component
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    Logger logger;

    @Override
    public List<User> getUsers() {
        List<User> query = jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS_QUERY, (resultSet, i) -> resultSetToUser(resultSet));
        logger.info("Get all users from users table [users count = "+query.size()+" ]");
        return query;
    }

    /**
     * Convert resultset from db query into entity
     * @param resultSet
     * @return
     */
    private User resultSetToUser(ResultSet resultSet){
        User user;
        try {
            user = new User();
            user.setLogin(resultSet.getString("login"));
            user.setId(resultSet.getLong("id"));

        }catch (SQLException e){
            logger.error(e.toString());
            return new User();
        }
        return user;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public Optional<User> getUser(String login) {
        return jdbcTemplate.queryForObject(SqlQueries.SELECT_USER_WITH_LOGIN,new Object[]{login},(resultSet, i) -> Optional.of(resultSetToUser(resultSet)));
    }
}
