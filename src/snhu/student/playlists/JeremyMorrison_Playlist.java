package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class JeremyMorrison_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> ozzyOsbourneTracks = new ArrayList<Song>();
    OzzyOsbourne OzzyOsbourne = new OzzyOsbourne();
	
    ozzyOsbourneTracks = OzzyOsbourne.getOzzyOsbourneSongs();
	
	playlist.add(ozzyOsbourneTracks.get(0));
	playlist.add(ozzyOsbourneTracks.get(1));
	
    Aerosmith aerosmithBand = new Aerosmith();
	ArrayList<Song> aerosmithTracks = new ArrayList<Song>();
    aerosmithTracks = aerosmithBand.getAerosmithSongs();
	
	playlist.add(aerosmithTracks.get(0));
	playlist.add(aerosmithTracks.get(1));
	playlist.add(aerosmithTracks.get(2));
	
	Eminem eminemBand = new Eminem();
	ArrayList<Song> eminemTracks = new ArrayList<Song>();
	eminemTracks = eminemBand.getEminemSongs();
	
	playlist.add(eminemTracks.get(0));
	playlist.add(eminemTracks.get(1));
	
    return playlist;
	}
}
