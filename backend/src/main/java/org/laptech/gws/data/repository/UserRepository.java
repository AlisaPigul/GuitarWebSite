package org.laptech.gws.data.repository;

import org.laptech.gws.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * UserDAO
 * @author rlapin on 12/13/16.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAll();
    User getUserByLogin(String login);
}
