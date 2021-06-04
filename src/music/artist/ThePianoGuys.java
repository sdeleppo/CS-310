// Added by Tyson Smith
package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class ThePianoGuys {
	
	public static final String ARTIST_NAME = "The Piano Guys";
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ThePianoGuys() {
    }
    
    public ArrayList<Song> getThePianoGuysSongs() {

    	albumTracks = new ArrayList<Song>();
    	Song track1 = new Song("Beethoven's 5 Secrets", ARTIST_NAME);
    	Song track2 = new Song("A Thousand Years", ARTIST_NAME);
    	Song track3 = new Song("Over the Rainbow / Simple Gifts", ARTIST_NAME);
    	this.albumTracks.add(track1);
    	this.albumTracks.add(track2);
    	this.albumTracks.add(track3);
    	return albumTracks;
    }
}