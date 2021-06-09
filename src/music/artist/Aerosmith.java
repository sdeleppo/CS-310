package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Aerosmith {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Aerosmith() {
    }
    
    public ArrayList<Song> getAerosmithSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Janie's Got A Gun", "Big Ones");               //Create a song
         Song track2 = new Song("Rag Doll", "Big Ones");                        //Create another song
         Song track3 = new Song("Crazy", "Get A Grip");                         //Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Aerosmith
         this.albumTracks.add(track2);                                          //Add the second song to song list for Aerosmith 
         this.albumTracks.add(track3);                                          //Add the thrid song to song list for Aerosmith
         return albumTracks;                                                    //Return the songs for Aerosmith in the form of an ArrayList
    }
}