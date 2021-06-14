package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

//Create a new artist Bon Jovi
public class BonJovi {
	
	//  Initialize variables for albumTrack (a list) and album title	
	ArrayList<Song> albumTracks;
	String albumTitle;
	
	public BonJovi() {
	}

	//  Method to create a instance of a list to get songs for Bon Jovi
	public ArrayList<Song> getBonJoviSongs() {
		
		albumTracks = new ArrayList<Song>();						//  Instantiate the album to populate it below
		Song track1 = new Song("Livin' On a Prayer", "Bon Jovi");	//  Create a song
		Song track2 = new Song("It's My Life", "Bon Jovi");			//  Create another song
		Song track3 = new Song("Have a Nice Day", "Bon Jovi");		//  Create another song
		Song track4 = new Song("Wanted Dead or Alive", "Bon Jovi");	//  Create another song
		
		this.albumTracks.add(track1);								//  Add song to Bon Jovi song list.
		this.albumTracks.add(track2);								//  Add song to Bon Jovi song list.
		this.albumTracks.add(track3);								//  Add song to Bon Jovi song list.
		this.albumTracks.add(track4);								//  Add song to Bon Jovi song list.		
		return albumTracks;											//Return the songs for the Bon Jovi in the form of an ArrayList
	}

}