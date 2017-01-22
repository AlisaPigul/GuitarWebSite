package org.laptech.gws.data.entities.repository;

import org.laptech.gws.data.entities.Chords;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * @author rlapin
 */
@RepositoryRestResource(path = "chords",collectionResourceRel = "chords")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ChordsRepository extends MongoRepository<Chords,Long> {

}
