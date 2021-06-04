package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class SyndaSimmers_Playlist {
	/* added for module 6 requirements
	 * songs from Helb Alpert, Burt Bacharach, and Imagine Dragons
	 */
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> bacharachTracks = new ArrayList<Song>();
	BurtBacharach burtBacharach = new BurtBacharach();
	bacharachTracks = burtBacharach.getBurtBacharachSongs();
	
	playlist.add(bacharachTracks.get(0));
	playlist.add(bacharachTracks.get(1));
	playlist.add(bacharachTracks.get(2));	

	ArrayList<Song> herbAlpertTracks = new ArrayList<Song>();
	HerbAlpert herbAlpert = new HerbAlpert();
	herbAlpertTracks = herbAlpert.getHerbAlpertSongs();
	
	playlist.add(herbAlpertTracks.get(0));
	playlist.add(herbAlpertTracks.get(1));
	
	ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
	ImagineDragons imagineDragonsBand = new ImagineDragons();
    imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs();
	
	playlist.add(imagineDragonsTracks.get(0));
	
    return playlist;
	}
}
