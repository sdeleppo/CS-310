package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tennyson_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	Coldplay coldplay = new Coldplay();
	ArrayList<Song> coldplayTracks = new ArrayList<Song>();	
    coldplayTracks = coldplay.getColdplaySongs();
	playlist.add(coldplayTracks.get(0));
		
	KendrickLamar Kendrick = new KendrickLamar();
	ArrayList<Song> KendrickLamarTracks = new ArrayList<Song>();
	KendrickLamarTracks = Kendrick.getKendrickSongs();	
	playlist.add(KendrickLamarTracks.get(0));
	playlist.add(KendrickLamarTracks.get(1));
	playlist.add(KendrickLamarTracks.get(2));
	playlist.add(KendrickLamarTracks.get(3));
	
	BillWithers billWithers = new BillWithers();
	ArrayList<Song> BillWithersTracks = new ArrayList<Song>();
	BillWithersTracks = billWithers.getBillWithersSongs();	
	playlist.add(BillWithersTracks.get(0));
	
    return playlist;
	}
}
