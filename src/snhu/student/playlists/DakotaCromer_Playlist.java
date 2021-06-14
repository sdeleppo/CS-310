package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.BonJovi;
import music.artist.Coldplay;
import music.artist.OzzyOsbourne;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

public class DakotaCromer_Playlist {
public LinkedList<PlayableSong> StudentPlaylist() {
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		ArrayList<Song> Ozzy = new ArrayList<Song>();
		ArrayList<Song> Cold = new ArrayList<Song>();
		ArrayList<Song> BonJ = new ArrayList<Song>();
		
		Coldplay cp = new Coldplay();
	    OzzyOsbourne OO = new OzzyOsbourne();
	    BonJovi bj = new BonJovi();
	    
	    
		Ozzy = OO.getOzzyOsbourneSongs(); // added Ozzy songs to Dakota's playlist
		Cold = cp.getColdplaySongs(); //added Coldplay songs to Dakota's playlist
		BonJ = bj.getBonJoviSongs(); //added Bonjovi Songs to Dakota's playlist
		
		playlist.add(Ozzy.get(0));
		playlist.add(Ozzy.get(1));
		playlist.add(Cold.get(0));
		playlist.add(BonJ.get(0));
		playlist.add(BonJ.get(1));
		playlist.add(BonJ.get(2));
		playlist.add(BonJ.get(3));
		
	    return playlist;
	}
}
