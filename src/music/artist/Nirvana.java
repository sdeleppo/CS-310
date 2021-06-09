package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Nirvana {

	ArrayList<Song> albumTracks;
	String albumTitle;

	public Nirvana() {
	}

	public ArrayList<Song> getNirvanaSongs() {
		// If albumTracks already contains songs, return the list.
		if (this.albumTracks != null && this.albumTracks.size() > 0) {
			return this.albumTracks;
		}

		this.albumTracks = new ArrayList<Song>();
		String[] songTitles = new String[] { "Heart-Shaped Box", "Pennyroyal Tea", "Lake Of Fire" };

		// Loop over song titles and add new Songs to albumTracks.
		for (String songTitle : songTitles) {
			this.albumTracks.add(new Song(songTitle, "Nirvana"));
		}

		return this.albumTracks;
	}
}
