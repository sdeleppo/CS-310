package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FleshgodApocalypse {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FleshgodApocalypse() {
    }
    
    public ArrayList<Song> getFleshgodApocalypseSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Violation", "Fleshgod Apocalypse");        //Create a song
         Song track2 = new Song("The Fool", "Fleshgod Apocalypse");             //Create another song
         Song track3 = new Song("Sugar", "Fleshgod Apocalypse");                //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Fleshgod Apocalypse
         this.albumTracks.add(track2);                                          //Add the second song to song list for Fleshgod Apocalypse 
         this.albumTracks.add(track3);											//Add the third song to song list for Fleshgod Apocalypse
         return albumTracks;                                                    //Return the songs for Fleshgod Apocalypse in the form of an ArrayList
    }
}