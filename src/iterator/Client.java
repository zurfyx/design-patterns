package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        Song song1 = new MySong("lalala");
        Song song2 = new MySong("flalala");
        List<Song> mySongs = new ArrayList<Song>() {{
            add(song1);
            add(song2);
        }};

        for (Iterator songIterator = new SongIterator(mySongs); songIterator.hasNext();) {
            Song currentSong = (Song) songIterator.next();
            currentSong.play();
        }
    }
}
