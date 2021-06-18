package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class LedZeppelin {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public LedZeppelin() {
    }
    
    public ArrayList<Song> getLedZeppelinSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Ocean", "Led Zeppelin");            		//Create a song
         Song track2 = new Song("Whole Lotta Love", "Led Zeppelin");         	//Create another song
         Song track3 = new Song("Black Dog", "Led Zeppelin");         			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Led Zeppelin
         this.albumTracks.add(track2);                                          //Add the second song to song list for Led Zeppelin 
         this.albumTracks.add(track3); 											//Add the third song to song list for Led Zeppelin 
         return albumTracks;                                                    //Return the songs for Led Zeppelin in the form of an ArrayList
    }
}
