package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.LinkinPark;
import music.artist.LedZeppelin;
import music.artist.Sum41;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

public class CharlesMerrick_Playlist {
public LinkedList<PlayableSong> StudentPlaylist() {
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		ArrayList<Song> Link = new ArrayList<Song>();
		ArrayList<Song> LedZ = new ArrayList<Song>();
		ArrayList<Song> Sum4 = new ArrayList<Song>();
		
		LinkinPark lp = new LinkinPark();
	    LedZeppelin lz = new LedZeppelin();
	    Sum41 nv = new Sum41();
	    
	    
		Link = lp.getLinkinParkSongs(); // added Linkin Park songs to Charles' playlist
		LedZ = lz.getLedZeppelinSongs(); //added Led Zeppelin songs to Charles' playlist
		Sum4 = nv.getSum41Songs(); //added Sum41 Songs to Charles' playlist
		
		playlist.add(Link.get(0));
		playlist.add(Link.get(1));
		playlist.add(Link.get(2));
		playlist.add(LedZ.get(0));
		playlist.add(LedZ.get(1));
		playlist.add(LedZ.get(2));
		playlist.add(Sum4.get(0));
		playlist.add(Sum4.get(1));
		playlist.add(Sum4.get(2));
		
	    return playlist;
	}
}
