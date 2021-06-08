package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class SyndaSimmers_Playlist {
	/* added for module 6 requirements
	 * songs from StillWoozy and Gorillaz 
	 */
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> StillWoozyTracks = new ArrayList<Song>();
	StillWoozy stillWoozy = new StillWoozy();
	StillWoozyTracks = stillWoozy.getStillWoozySongs();
	
	playlist.add(StillWoozyTracks.get(0));
	playlist.add(StillWoozyTracks.get(1));
	playlist.add(StillWoozyTracks.get(2));	

	
	ArrayList<Song> GorillazTracks = new ArrayList<Song>();
	Gorillaz gorillaz = new Gorillaz();
	GorillazTracks = gorillaz.getGorillazSongs();
	
	playlist.add(GorillazTracks.get(0));
	playlist.add(GorillazTracks.get(1));
	playlist.add(GorillazTracks.get(2));	
	
	
    return playlist;
	}
}
