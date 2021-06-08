package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class BurtBacharach {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BurtBacharach() {
    }
    
    public ArrayList<Song> getBurtBacharachSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   		//Instantiate the album so we can populate it below
    	 Song track1 = new Song("I'll Never Fall In Love Again", "Burt Bacharach");     //Create a song
         Song track2 = new Song("What the World Needs Now Is Love", "Burt Bacharach");  //Create another song
         Song track3 = new Song("Toledo", "Burt Bacharach");				            //Create a third song
         this.albumTracks.add(track1);                                          		//Add the first song to song list for the Burt Bacharach
         this.albumTracks.add(track2);                                          		//Add the second song to song list for the Burt Bacharach 
         this.albumTracks.add(track3);                                          		//Add the third song to song list for the Burt Bacharach
         return albumTracks;                                                    		//Return the songs for Burt Bacharach in the form of an ArrayList
    }
}
