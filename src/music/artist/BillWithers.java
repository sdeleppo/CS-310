package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class BillWithers {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BillWithers() {
    }
    
    public ArrayList<Song> getBillWithersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Use me", "Bill Withers");         //Create a song
         
         this.albumTracks.add(track1);                                  //Add the first song to song list for Imagine Dragons
         return albumTracks; 
    }
}