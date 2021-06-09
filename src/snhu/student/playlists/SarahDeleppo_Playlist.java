package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class SarahDeleppo_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	//create linked list for personal playlist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//create arraylist to access tracks inside Gorillaz class, create instance of Gorillaz class
	ArrayList<Song> gorillazTracks = new ArrayList<Song>();
    Gorillaz gorillazBand = new Gorillaz();
	//populate arraylist with tracks from Gorillaz class
    gorillazTracks = gorillazBand.getGorillazSongs();
	//add those tracks to playlist
	playlist.add(gorillazTracks.get(0));
	playlist.add(gorillazTracks.get(1));
	playlist.add(gorillazTracks.get(2));
	
	//instantiate class, create list for tracks, populate list with tracks
    Phantogram phantogramBand = new Phantogram();
	ArrayList<Song> phantogramTracks = new ArrayList<Song>();
    phantogramTracks = phantogramBand.getPhantogramSongs();
	//add tracks to playlist
	playlist.add(phantogramTracks.get(0));
	playlist.add(phantogramTracks.get(1));
	
    return playlist;
	}
}