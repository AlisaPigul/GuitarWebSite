package org.laptech.gws.data;

import java.util.List;

/**
 * @author rlapin
 */
public class SongPart {
    private SongPartType type;
    private List<SongLine> lines;

    public SongPartType getType() {
        return type;
    }

    public void setType(SongPartType type) {
        this.type = type;
    }

    public List<SongLine> getLines() {
        return lines;
    }

    public void setLines(List<SongLine> lines) {
        this.lines = lines;
    }
}
