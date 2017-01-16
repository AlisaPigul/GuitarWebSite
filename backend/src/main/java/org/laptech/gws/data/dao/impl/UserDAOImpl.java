package org.laptech.gws.data.dao.impl;

import org.laptech.gws.constants.db.SqlQueries;
import org.laptech.gws.data.User;
import org.laptech.gws.data.dao.UserDAO;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
public class UserDAOImpl implements UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private Logger logger;

    @Override
    public List<User> getUsers() {
        List<User> query = jdbcTemplate.query(SqlQueries.SELECT_ALL_USERS_QUERY, (resultSet, i) -> resultSetToUser(resultSet));
        logger.info("Get all users from users table [users count = "+query.size()+" ]");
        return query;
    }

    /**
     * Convert resultset from db query into entity
     * @param resultSet
     * @return User entity
     */
    private User resultSetToUser(ResultSet resultSet){
        User user;
        try {
            user = new User();
            user.setLogin(resultSet.getString("login"));

        }catch (SQLException e){
            logger.error(e.toString());
            return new User();

        }
        return user;
    }

    @Override
    public void addUser(User user) {
        jdbcTemplate.update(SqlQueries.INSERT_USER_WITH_LOGIN, user.getName(),user.getPassword());
    }

    @Override
    public Optional<User> getUser(String login) {
        try {
            return jdbcTemplate.queryForObject(SqlQueries.SELECT_USER_WITH_LOGIN, new Object[]{login}, (resultSet, i) -> Optional.of(resultSetToUser(resultSet)));
        }catch(EmptyResultDataAccessException exception){
            return Optional.empty();
        }
    }
}
