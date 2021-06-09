package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Eminem {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Eminem() {
    }
    
    public ArrayList<Song> getEminemSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Rap God", "Eminem");             //Create a song
         Song track2 = new Song("Higher", "Eminem");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Eminem
         this.albumTracks.add(track2);                                          //Add the second song to song list for Eminem
         return albumTracks;                                                    //Return the songs for Eminem in the form of an ArrayList
    }
}
