package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.*;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

//Created new class Kaitlyn French Playlist
public class KaitlynFrench_Playlist {
	
	
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	//Create a new linked list for playlist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	// add Adele's track to playlist and create array list for artist songs
	// allow to access properties and use getSong() method while adding tracks to the playlist
	ArrayList<Song> adeleTracks = new ArrayList<Song>();
    Adele adele = new Adele();
    adeleTracks = adele.getAdelesSongs();
	
	playlist.add(adeleTracks.get(0));
	playlist.add(adeleTracks.get(1));
	playlist.add(adeleTracks.get(2));
	
	
	// add BonJovi's tracks to playlist and create array list for artist songs
	// allow to access songs and use getSong() method while adding tracks to the playlist
	BonJovi BonJoviBand = new BonJovi();
	ArrayList<Song> BonJoviTracks = new ArrayList<Song>();
	BonJoviTracks = BonJoviBand.getBonJoviSongs();
	
	playlist.add(BonJoviTracks.get(0));
	playlist.add(BonJoviTracks.get(1));
	playlist.add(BonJoviTracks.get(2));
	
	//add ImagineDragons tracks to playlist
	//create array list for ImagineDragons songs
	//use getSong() method to add tracks to playlist
    ImagineDragons imagineDragonsBand = new ImagineDragons();
	ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
    imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs();
	
	playlist.add(imagineDragonsTracks.get(0));
	playlist.add(imagineDragonsTracks.get(1));
	playlist.add(imagineDragonsTracks.get(2));
	
	
	//add ForeverALetDown tracks to playlist
	//create array list for ForeverALetDown
	//use getSong() method to add tracks to playlist
	ForeverALetDown ForeverALetDownBand = new ForeverALetDown();
	ArrayList<Song> ForeverALetDownTracks = new ArrayList<Song>();
	ForeverALetDownTracks = ForeverALetDownBand.getForeverALetDownsSongs();
	
	playlist.add(ForeverALetDownTracks.get(0));
	playlist.add(ForeverALetDownTracks.get(1));
	playlist.add(ForeverALetDownTracks.get(2));
	playlist.add(ForeverALetDownTracks.get(3));
	
	
	//add MichaelBuble tracks to playlist
	//create array list for MichaelBuble
	//use getSong() method to add tracks to playlist
	MichaelBuble MichaelBubleBand = new MichaelBuble();
	ArrayList<Song> MichaelBubleTracks = new ArrayList<Song>();
	MichaelBubleTracks = MichaelBubleBand.getMichaelBublesSongs();
	
	playlist.add(MichaelBubleTracks.get(0));
	playlist.add(MichaelBubleTracks.get(1));
	playlist.add(MichaelBubleTracks.get(2));
	playlist.add(MichaelBubleTracks.get(3));
	
	//add BillWithers tracks to playlist
	//create array list for BillWithers
	//use getSong() method to add tracks to playlist
	BillWithers BillWithersBand = new BillWithers();
	ArrayList<Song> BillWithersTracks= new ArrayList<Song>();
	BillWithersTracks = BillWithersBand.getBillWithersSongs();
	
	playlist.add(BillWithersTracks.get(0));
	
	//add FleshgodApocalypse tracks to playlist
	//create array list for FleshgodApocalypse
	//use getSong() method to add tracks to playlist
	FleshgodApocalypse FleshgodApocalypseBand = new FleshgodApocalypse();
	ArrayList<Song> FleshgodApocalypseTracks= new ArrayList<Song>();
	FleshgodApocalypseTracks = FleshgodApocalypseBand.getFleshgodApocalypseSongs();
	
	playlist.add(FleshgodApocalypseTracks.get(0));
	playlist.add(FleshgodApocalypseTracks.get(1));
	playlist.add(FleshgodApocalypseTracks.get(2));
	
	//added EricChurch tracks to playlist
	//create array list for EricChurch
	//use getSong() method to add tracks to playlist
	EricChurch ericChurch = new EricChurch();
	ArrayList<Song> ericChurchTracks = new ArrayList<Song>();
	ericChurchTracks = ericChurch.getEricChurchSongs();
		
	playlist.add(ericChurchTracks.get(0));
	playlist.add(ericChurchTracks.get(1));
	
	//added Nirvana tracks to playlist
	//create array list for Nirvana
	//use getSong() method to add tracks to playlist
	Nirvana nirvanaBand = new Nirvana();
	ArrayList<Song> nirvanaTracks = new ArrayList<Song>();
	nirvanaTracks = nirvanaBand.getNirvanaSongs();
	
	playlist.add(nirvanaTracks.get(0));
	playlist.add(nirvanaTracks.get(1));
	playlist.add(nirvanaTracks.get(2));
	
	
	return playlist;
	}
}