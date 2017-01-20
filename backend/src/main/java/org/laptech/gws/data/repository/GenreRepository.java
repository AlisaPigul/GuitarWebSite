package org.laptech.gws.data.repository;

import org.laptech.gws.data.Chords;
import org.laptech.gws.data.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rlapin
 */
public interface GenreRepository extends JpaRepository<Genre,String> {
}
