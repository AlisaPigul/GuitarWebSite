package org.laptech.gws.data;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

/**
 * @author rlapin
 */


public class Album {

    @Id
    private long id;

    private List<Song> songs;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (id != album.id) return false;
        if (songs != null ? !songs.equals(album.songs) : album.songs != null) return false;
        return name != null ? name.equals(album.name) : album.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (songs != null ? songs.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
