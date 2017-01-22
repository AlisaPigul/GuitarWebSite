package org.laptech.gws.data.entities;

import org.laptech.gws.data.ChordsFormat;
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
    @DBRef
    private User author;
    @DBRef
    private Song song;

    private Date creationDate;



    private ChordsFormat chordsSet;

    private Date approvalDate;

    boolean visible;
    @DBRef
    private List<Tag> tag;

    public long getId() {
        return id;
    }


    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ChordsFormat getChordsSet() {
        return chordsSet;
    }

    public void setChordsSet(ChordsFormat chordsSet) {
        this.chordsSet = chordsSet;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }
}
