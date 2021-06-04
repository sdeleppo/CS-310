package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Phantogram {
	//Added by Sarah Deleppo
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Phantogram() {
    }
    
    public ArrayList<Song> getPhantogramSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("When I'm Small", "Phantogram");             //Create a song with associated band
         Song track2 = new Song("Cruel World", "Phantogram");         //Create another song with associated band
         this.albumTracks.add(track1);                                          //Add the first song to song list for Phantogram
         this.albumTracks.add(track2);                                          //Add the second song to song list for Phantogram
         return albumTracks;                                                    //Return the songs for Phantogram in the form of an ArrayList
    }
}
