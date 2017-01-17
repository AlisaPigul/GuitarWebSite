package org.laptech.gws.data;

import javax.persistence.*;
import java.util.List;

/**
 * @author rlapin
 */
@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue
    private long id;


    private String title;
    private String artist;
    @OneToMany(mappedBy = "name")
    private List<Genre> genre;


    @OneToOne
    private Album album;

    @OneToOne
    private Chords stableChords;
    @OneToMany
    private List<Chords> allChords;
}
