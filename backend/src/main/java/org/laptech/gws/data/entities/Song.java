package org.laptech.gws.data.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;
import java.util.Set;

/**
 * @author rlapin
 */
public class Song {
    @Id
    private long id;


    private String title;
    private String artist;
    @DBRef
    private Set<Genre> genre;

    @DBRef
    private Album album;
    @DBRef
    private Chords stableChords;
    @DBRef
    private List<Chords> allChords;
}
