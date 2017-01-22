package org.laptech.gws.data;

import org.laptech.gws.data.entities.Chords;

import java.util.List;

/**
 * @author rlapin
 */
public class ChordsFormat {
    private List<SongPart> parts;

    public List<SongPart> getParts() {
        return parts;
    }

    public void setParts(List<SongPart> parts) {
        this.parts = parts;
    }

}
