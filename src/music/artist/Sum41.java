package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Sum41 {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Sum41() {
    }
    
    public ArrayList<Song> getSum41() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Fat Lip", "Sum41");             				//Create a song
         Song track2 = new Song("All to Blame", "Sum41");         				//Create another song
         Song track3 = new Song("Underclass Hero", "Sum41");         			//Create another song         
         this.albumTracks.add(track1);                                          //Add the first song to song list for Sum41
         this.albumTracks.add(track2);                                          //Add the second song to song list for Sum41 
         this.albumTracks.add(track3);											//Add the third song to song list for Sum41
         return albumTracks;                                                    //Return the songs for Sum41 in the form of an ArrayList
    }
}
