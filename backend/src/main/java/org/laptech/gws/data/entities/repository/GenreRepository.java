package org.laptech.gws.data.entities.repository;

import org.laptech.gws.data.entities.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author rlapin
 */
public interface GenreRepository extends MongoRepository<Genre,String> {
}
