package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class PeterOzechowski_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();			//creating a new array for the songs in a play-list
	ArrayList<Song> linkinparkTracks = new ArrayList<Song>();					//setting the array items to be the artist of choice
    LinkinPark linkinParkBand = new LinkinPark();								//setting the corresponding songs of the artist
	
    linkinparkTracks = linkinParkBand.getLinkinParkSongs();
	
	playlist.add(linkinparkTracks.get(0));										//adding to the play-list the first linkin park song
	playlist.add(linkinparkTracks.get(1));										//adding to the play-list the second linkin park song
	playlist.add(linkinparkTracks.get(2));										//adding to the play-list the third linkin park song
	
	
    Sum41 sum41Band = new Sum41();												//creating a new band of type sum41 (new artist)
	ArrayList<Song> sum41Tracks = new ArrayList<Song>();						//creating a new list of music
    sum41Tracks = sum41Band.getSum41Songs();									//setting the corresponding song names
	
	playlist.add(sum41Tracks.get(0));											//adding to the play-list the first sum41 song
	playlist.add(sum41Tracks.get(1));											//adding to the play-list the second sum41 song
	playlist.add(sum41Tracks.get(2));											//adding to the play-list the third sum41 song
	
	//adding to the play-list another peers artist/song selection
    Aerosmith aerosmithBand = new Aerosmith();									//creating a new band of type sum41 (new artist)
	ArrayList<Song> aerosmithTracks = new ArrayList<Song>();					//creating a new list of music
    aerosmithTracks = aerosmithBand.getAerosmithSongs();						//setting the corresponding song names
	
	playlist.add(aerosmithTracks.get(0));										//adding to the play-list the first aerosmith song
	playlist.add(aerosmithTracks.get(1));										//adding to the play-list the second aerosmith song

    
    return playlist;
	}
}
