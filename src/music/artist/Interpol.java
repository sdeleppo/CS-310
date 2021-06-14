package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Interpol {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Interpol() {
    }
    
    public ArrayList<Song> getInterpolSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Heinrich Maneuver", "Interpol");        //Create a song
         Song track2 = new Song("Evil", "Interpol");                         //Create another song
         Song track3 = new Song("All the Rage Back Home", "Interpol");       //Create a third song
         Song track4 = new Song("C'mere", "Interpol");                       //Create a fourth song
         Song track5 = new Song("Slow Hands", "Interpol");                   //Create a fifth song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         this.albumTracks.add(track3);                                  //Add the third song to song list
         this.albumTracks.add(track4);                                  //Add the fourth song to song list
         this.albumTracks.add(track5);                                  //Add the fifth song to song list
         return albumTracks;                                            //Return the songs for Interpol in the form of an ArrayList
    }
}