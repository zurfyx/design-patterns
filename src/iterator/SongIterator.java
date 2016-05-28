package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by zero on 28/05/16.
 */
public class SongIterator implements Iterator {
    private final Iterator<Song> songsIterator;

    public SongIterator(List<Song> songs) {
        this.songsIterator = songs.iterator();
    }

    @Override
    public boolean hasNext() {
        return songsIterator.hasNext();
    }

    @Override
    public Object next() {
        return songsIterator.next();
    }
}
