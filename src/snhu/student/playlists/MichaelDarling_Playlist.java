package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class MichaelDarling_Playlist {

	// Public Methods
	/***********************************************/
	/**
	 * Returns a list that contains all songs by all of my artists.
	 * 
	 * @return	LinkedList of type PlayableSong.
	 */
	public LinkedList<PlayableSong> StudentPlaylist() {
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();

		IArtist[] artists = this.GetArtistList();
		
		// Loops over all artists and adds that artist's songs to the playlist.
		for (IArtist artist : artists) {
			ArrayList<Song> songs = artist.getSongs();
			playlist.addAll(songs);
		}

		return playlist;
	}
	/***********************************************/

	// Helper Methods
	/***********************************************/
	/**
	 * Returns an array of my artists.
	 * @return an array of interface type IArtist
	 */
	private IArtist[] GetArtistList() {
		Nirvana nirvana = new Nirvana();
		RunDMC runDMC = new RunDMC();
		return new IArtist[] { nirvana, runDMC };
	}
	/***********************************************/

}
