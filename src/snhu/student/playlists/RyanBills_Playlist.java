package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class RyanBills_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> LedZeppelinTracks = new ArrayList<Song>();
    LedZeppelin LedZeppelin = new LedZeppelin();
	
    LedZeppelinTracks = LedZeppelin.getLedZeppelinSongs();
	
	playlist.add(LedZeppelinTracks.get(0));
	playlist.add(LedZeppelinTracks.get(1));
	playlist.add(LedZeppelinTracks.get(2));
	
	// Adding tracks from a peer's artist
    Coldplay Coldplay = new Coldplay();
	ArrayList<Song> ColdplayTracks = new ArrayList<Song>();
    ColdplayTracks = Coldplay.getColdplaySongs();
	
	playlist.add(ColdplayTracks.get(0));
	
    return playlist;
	}
}
