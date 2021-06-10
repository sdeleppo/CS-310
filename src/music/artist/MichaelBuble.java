package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class MichaelBuble {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public MichaelBuble() {
    }
    
    public ArrayList<Song> getMichaelBublesSongs() {
    	
    	//create the album that holds the songs
    	 albumTracks = new ArrayList<Song>();
    	 
    	 //create songs for the album to hold
    	 Song track1 = new Song("Feeling Good", "Everything");
         Song track2 = new Song("Home", "Save the Last Dance for Me");
         Song track3 = new Song("Sway", "It's a Beautiful Day");
         Song track4 = new Song("Heven't Met You Yet", "Close Your Eyes");
         
         //create tracks to pull up the songs listed for MichaelBuble
         this.albumTracks.add(track1);
         this.albumTracks.add(track2); 
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         
         return albumTracks;
    }
}