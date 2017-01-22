package org.laptech.gws.data;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
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
    private Set<Genre> genre;


    private Album album;

    private Chords stableChords;
    private List<Chords> allChords;
}
