package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Mudvayne {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Mudvayne() {
    }
    
    public ArrayList<Song> getBeatlesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Dig", "Mudvayne");             //Create a song
         Song track2 = new Song("Death Blooms", "Mudvayne");         //Create another song
         Song track3 = new Song("Happy", "Mudvayne"); 
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}
