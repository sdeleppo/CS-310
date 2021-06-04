package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class PauloLondra {

	public static final String ARTIST_NAME = "Paulo Londra";
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PauloLondra() {
    }
    
    public ArrayList<Song> getPauloLondraSongs() {
    	
    	 albumTracks = new ArrayList<Song>();
    	 Song track1 = new Song("Forever Alone", ARTIST_NAME);      
         Song track2 = new Song("Chica Paranormal", ARTIST_NAME);    
         Song track3 = new Song("Solo Pienso En Ti", ARTIST_NAME);     
         Song track4 = new Song("Querido Amigo", ARTIST_NAME);      
         this.albumTracks.add(track1);                   
         this.albumTracks.add(track2);                               
         this.albumTracks.add(track3);
         this.albumTracks.add(track4); 
         return albumTracks;                                            
    }
}