package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class StillWoozy {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public StillWoozy() {
    }
    
    public ArrayList<Song> getStillWoozySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Habit", "Still Woozy");                        //Create a song
         Song track2 = new Song("Window", "Still Woozy"); 						//Create another song
         Song track3 = new Song("BS", "Still Woozy"); 							//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list 
         this.albumTracks.add(track2);  										//Add the second song to song list 
         this.albumTracks.add(track3); 	                                     	//Add the third song to song list
         return albumTracks;                                                    //Return the songs for Still Woozy in the form of an ArrayList
    }
}
