package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class GabrielSwortwood_Playlist {

	public LinkedList<PlayableSong> StudentPlaylist() {
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		ArrayList<Song> InterpolTracks = new ArrayList<Song>();
	    Interpol interPol = new Interpol();
		InterpolTracks = interPol.getInterpolSongs(); // added Interpol songs to Gabriel's playlist
		
		playlist.add(InterpolTracks.get(0));
		playlist.add(InterpolTracks.get(1));
		playlist.add(InterpolTracks.get(2));
		playlist.add(InterpolTracks.get(3));
		playlist.add(InterpolTracks.get(4));
		
	    return playlist;
	}
}