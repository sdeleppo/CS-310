package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class OzzyOsbourne {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public OzzyOsbourne() {
    }
    
    public ArrayList<Song> getOzzyOsbourneSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Dreamer", "Down To Earth");                    //Create a song
         Song track2 = new Song("All My Life", "Ordinary Man");                 //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Ozzy Osbourne
         this.albumTracks.add(track2);                                          //Add the second song to song list for Ozzy Osbourne 
         return albumTracks;                                                    //Return the songs for Ozzy Osbourne in the form of an ArrayList
    }
}