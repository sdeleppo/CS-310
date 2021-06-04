package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class HerbAlpert {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public HerbAlpert() {
    }
    
    public ArrayList<Song> getHerbAlpertSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                  //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Rise", "Herb Alpert");		   //Create a song
         Song track2 = new Song("Route 101", "Herb Alpert");   //Create another song
         this.albumTracks.add(track1);                     	   //Add the first song to song list for the Burt Bacharach
         this.albumTracks.add(track2);                         //Add the second song to song list for the Burt Bacharach 
         return albumTracks;                                   //Return the songs for Burt Bacharach in the form of an ArrayList
    }
}
