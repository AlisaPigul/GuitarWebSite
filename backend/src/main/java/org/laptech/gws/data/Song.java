package org.laptech.gws.data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "name")
    private Set<Genre> genre;


    @OneToOne
    private Album album;

    @OneToOne
    private Chords stableChords;
    @OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
    private List<Chords> allChords;
}
