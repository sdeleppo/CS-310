package music.artist;

import java.util.ArrayList;
import snhu.jukebox.playlist.Song;

/**
 * 
 * Abstract class that bootstraps the object with a 
 * required base constructor.
 *
 */
public abstract class BaseArtist implements IArtist {
	
	// Constructors 
	/***********************************************/
	public BaseArtist(String name, String[] songs) {
		this._artistName = name;
		this._songTitles = songs;
	}
	/***********************************************/ 
	
	// Local Variables
	/***********************************************/
	private String _artistName;
	
	private String[] _songTitles;
	
	private ArrayList<Song> _albumTracks;	
	/***********************************************/

	// Getters
	/***********************************************/
	/**
	 * 
	 * Returns a list of songs for the given artist. 
	 * 
	 * @return	ArrayList of type Song
	 */
	@Override
	public ArrayList<Song> getSongs() {
		// If albumTracks already contains songs, return the list.
		if (this._albumTracks != null && this._albumTracks.size() < 1) {
			return this._albumTracks;
		}
		this.PopulateSongs();
		return this._albumTracks;
	}
	/***********************************************/

	// Helper Methods
	/***********************************************/
	private void PopulateSongs() {
		this._albumTracks = new ArrayList<Song>();
		for (String songTitle : this._songTitles) {
			this._albumTracks.add(new Song(songTitle, this._artistName));
		}
	}
	/***********************************************/

}
