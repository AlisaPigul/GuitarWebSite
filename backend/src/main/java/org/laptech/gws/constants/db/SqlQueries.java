package org.laptech.gws.constants.db;

/**
 * @author rlapin
 */
public interface SqlQueries {

    String SELECT_ALL_USERS_QUERY = "SELECT * FROM users";
    String SELECT_USER_WITH_LOGIN = "SELECT * FROM users where login=?";
    String INSERT_USER_WITH_LOGIN = "INSERT INTO users (login, password) VALUES (?,?)";
}
