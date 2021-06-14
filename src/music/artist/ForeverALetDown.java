package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ForeverALetDown {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ForeverALetDown() {
    }
    
    public ArrayList<Song> getForeverALetDownsSongs() {
    	
    	//create the album that holds the songs
    	 albumTracks = new ArrayList<Song>();
    	 
    	 //create songs for the album to hold
    	 Song track1 = new Song("Spotlight", "Letdown");
         Song track2 = new Song("Harder To Breathe", "Quiet Hours");
         Song track3 = new Song("Sober", "Colors");
         Song track4 = new Song("Pain", "Fool's Gold");
         
         //create tracks to pull up the songs listed for ForeverALetDown
         this.albumTracks.add(track1);
         this.albumTracks.add(track2); 
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         
         return albumTracks;
    }
}