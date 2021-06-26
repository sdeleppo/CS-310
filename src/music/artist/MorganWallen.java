//Added by Kate Kowalyshyn
package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class MorganWallen {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public MorganWallen() {
    }
    
    public ArrayList<Song> getMorganWallenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Bandaid on a Bullet Hole", "Morgan Wallen");   //Create a song
         Song track2 = new Song("Silverado for Sale", "Morgan Wallen");         //Create another song
         Song track3 = new Song("Outlaw", "Morgan Wallen");						//Create another song
         Song track4 = new Song("Somebody's Problem", "Morgan Wallen");			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Morgan Wallen
         this.albumTracks.add(track2);                                          //Add the second song to song list for Morgan Wallen 
         this.albumTracks.add(track3);											//Add the third song to song list for Morgan Wallen
         this.albumTracks.add(track4);											//Add the fourth song to the song list for Morgan Wallen
         return albumTracks;                                                    //Return the songs for Morgan Wallen in the form of an ArrayList
    }
}
