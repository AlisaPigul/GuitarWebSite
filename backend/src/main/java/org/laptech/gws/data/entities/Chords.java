package org.laptech.gws.data.entities;

import org.laptech.gws.data.ChordsFormat;
import org.laptech.gws.data.SongPartType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;

/**
 * @author rlapin
 */
public class Chords {
    @Id
    private long id;

    private User author;
    @DBRef
    private Song song;

    private Date creationDate;



    private ChordsFormat format;

    private Date approvalDate;

    boolean visible;
    @DBRef
    private List<Tag> tag;


}
