package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class SarahDeleppo_Playlist {
    //added comment for code review purposes
	public LinkedList<PlayableSong> StudentPlaylist(){
	//create list for personal playlist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//instantiate class Gorillaz, create list for tracks, populate list with tracks
	Gorillaz gorillazBand = new Gorillaz();
	ArrayList<Song> gorillazTracks = new ArrayList<Song>();
    gorillazTracks = gorillazBand.getGorillazSongs();
	//add those tracks to playlist
	playlist.add(gorillazTracks.get(0));
	playlist.add(gorillazTracks.get(1));
	playlist.add(gorillazTracks.get(2));
	
	//instantiate class Phantogram, create list for tracks, populate list with tracks
    Phantogram phantogramBand = new Phantogram();
	ArrayList<Song> phantogramTracks = new ArrayList<Song>();
    phantogramTracks = phantogramBand.getPhantogramSongs();
	//add tracks to playlist
	playlist.add(phantogramTracks.get(0));
	playlist.add(phantogramTracks.get(1));
	
	//instantiate peer's class Nirvana, create list for tracks, populate list with tracks
	Nirvana nirvanaBand = new Nirvana();
	ArrayList<Song> nirvanaTracks = new ArrayList<Song>();
	nirvanaTracks = nirvanaBand.getNirvanaSongs();
	//add tracks to playlist
	playlist.add(nirvanaTracks.get(0));
	playlist.add(nirvanaTracks.get(1));
	playlist.add(nirvanaTracks.get(2));
	
    return playlist;
	}
}