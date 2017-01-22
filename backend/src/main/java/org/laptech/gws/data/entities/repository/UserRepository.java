package org.laptech.gws.data.entities.repository;

import org.laptech.gws.data.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * UserDAO
 * @author rlapin on 12/13/16.
 */
@RepositoryRestResource(exported = false)
public interface UserRepository extends MongoRepository<User,Long> {

    List<User> findAll();
    User getUserByLogin(String login);
}
