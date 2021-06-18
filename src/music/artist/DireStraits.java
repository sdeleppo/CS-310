package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class DireStraits {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public DireStraits() {
    }
    
    public ArrayList<Song> getDireStraitsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Sultans of Swing", "Dire Straits");            //Create a song
         Song track2 = new Song("Telegraph Road", "Dire Straits");         		//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Dire Straits
         this.albumTracks.add(track2);                                          //Add the second song to song list for Dire Straits 
         return albumTracks;                                                    //Return the songs for Dire Straits in the form of an ArrayList
    }
}
