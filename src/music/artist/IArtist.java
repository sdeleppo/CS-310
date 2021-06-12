package music.artist;

import java.util.ArrayList;
import snhu.jukebox.playlist.Song;

/**
 * Interface that creates a contract promising
 * a getter for an ArrayList of type Song.
 */
public interface IArtist {
	
	ArrayList<Song> getSongs();
	
}
