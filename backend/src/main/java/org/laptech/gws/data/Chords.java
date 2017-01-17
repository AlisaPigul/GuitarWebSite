package org.laptech.gws.data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author rlapin
 */
@Entity
@Table(name = "chords")
public class Chords {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private User author;

    @OneToOne
    private Song song;

    private Date creationDate;



    private Date approvalDate;

    boolean visible;

    @OneToMany
    private List<Tag> tag;


}
