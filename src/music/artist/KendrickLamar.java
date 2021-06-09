package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class KendrickLamar {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public KendrickLamar() {
    }
    
    public ArrayList<Song> getKendrickSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Rigamortus", "Kendrick Lamar");                //Create a song
    	 Song track2 = new Song("The Recipe", "Kendrick Lamar");                //Create a song
    	 Song track3 = new Song("DNA", "Kendrick Lamar");                       //Create a song
         Song track4 = new Song("XXX", "Kendrick Lamar");                       //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list
         this.albumTracks.add(track2);											//Add the second song to song list
         this.albumTracks.add(track3);											//Add the third song to song list
         this.albumTracks.add(track4); 											//Add the fourth song to song list
         return albumTracks;                                                    //Return the songs in the form of an ArrayList
    }
}
