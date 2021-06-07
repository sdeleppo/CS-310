package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FiveFingerDeathPunch {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FiveFingerDeathPunch() {
    }
    
    public ArrayList<Song> getFiveFingerDeathPunchSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Wrong Side of Heaven", "Five Finger Death Punch");             //Create a song
         Song track2 = new Song("Bad Company", "Five Finger Death Punch");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Five Finger Death Punch
         this.albumTracks.add(track2);                                          //Add the second song to song list for Five Finger Death Punch 
         return albumTracks;                                                    //Return the songs for Five Finger Death Punch in the form of an ArrayList
    }
}
