package org.laptech.gws.data.repository;

import org.laptech.gws.data.Chords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

/**
 * @author rlapin
 */
@RepositoryRestResource(path = "chords",collectionResourceRel = "chords")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public interface ChordsRepository extends JpaRepository<Chords,Long> {

}
