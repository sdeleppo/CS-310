package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Gorillaz {
	//Added by Sarah Deleppo
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Gorillaz() {
    }
    
    public ArrayList<Song> getGorillazSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Feel Good Inc.", "Gorillaz");             //Create a song with associated band
         Song track2 = new Song("Clint Eastwood", "Gorillaz");         //Create another song with associated band
         Song track3 = new Song("DARE", "Gorillaz");         //Create another song with associated band
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Gorillaz
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Gorillaz 
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Gorillaz 
         return albumTracks;                                                    //Return the songs for the Gorillaz in the form of an ArrayList
    }
}
