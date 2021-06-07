package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class KateKowalyshyn_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> morganWallenTracks = new ArrayList<Song>();
    MorganWallen morganWallen = new MorganWallen();
    morganWallenTracks = morganWallen.getMorganWallenSongs(); //added Morgan Wallen's songs to Kate's playlist
	
	playlist.add(morganWallenTracks.get(0));
	playlist.add(morganWallenTracks.get(1));
	playlist.add(morganWallenTracks.get(2));
	
	
    ImagineDragons imagineDragonsBand = new ImagineDragons();
	ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
    imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs(); //added Imagine Dragons' songs to Kate's playlist
	
	playlist.add(imagineDragonsTracks.get(0));
	playlist.add(imagineDragonsTracks.get(1));
	playlist.add(imagineDragonsTracks.get(2));
	
	
	Gorillaz gorillazBand = new Gorillaz();
	ArrayList<Song> gorillazTracks = new ArrayList<Song>();
	gorillazTracks = gorillazBand.getGorillazSongs(); //added Gorillaz's songs to Kate's Playlist
		
	playlist.add(gorillazTracks.get(0));
	playlist.add(gorillazTracks.get(1));
	playlist.add(gorillazTracks.get(2));
	
	
	EricChurch ericChurch = new EricChurch();
	ArrayList<Song> ericChurchTracks = new ArrayList<Song>();
	ericChurchTracks = ericChurch.getEricChurchSongs();
		
	playlist.add(ericChurchTracks.get(0));
	playlist.add(ericChurchTracks.get(1));
	
    return playlist;
	}
}
