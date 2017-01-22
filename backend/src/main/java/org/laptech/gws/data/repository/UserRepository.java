package org.laptech.gws.data.repository;

import org.laptech.gws.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

/**
 * UserDAO
 * @author rlapin on 12/13/16.
 */
@RepositoryRestResource(exported = false)
public interface UserRepository extends MongoRepository<User,Long> {

    List<User> findAll();
    User getUserByLogin(String login);
}
