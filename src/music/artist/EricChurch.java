//Added by Kate Kowalyshyn
package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class EricChurch {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public EricChurch() {
    }
    
    public ArrayList<Song> getEricChurchSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Heart on Fire", "Eric Church");   				//Create a song
         Song track2 = new Song("Crazyland", "Eric Church");       			    //Create another song
         Song track3 = new Song("Hell Of A View", "Eric Church");				//Create third song for Eric Church
         this.albumTracks.add(track1);                                          //Add the first song to song list for Eric Church
         this.albumTracks.add(track2);                                          //Add the second song to song list for Eric Church 
         this.albumTracks.add(track3);											//Add the third song to song list for Eric Church
         return albumTracks;                                                    //Return the songs for Eric Church in the form of an ArrayList
    }
}
