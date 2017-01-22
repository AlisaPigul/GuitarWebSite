package org.laptech.gws.data;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author rlapin
 */
public class Chords {
    @Id
    private long id;

    private User author;

    private Song song;

    private Date creationDate;



    private Date approvalDate;

    boolean visible;

    private List<Tag> tag;


}
