package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class RunDMC {

	ArrayList<Song> albumTracks;
	String albumTitle;

	public RunDMC() {
	}

	public ArrayList<Song> getRunDMCSongs() {
		// If albumTracks already contains songs, return the list.
		if (this.albumTracks != null && this.albumTracks.size() > 0) {
			return this.albumTracks;
		}

		this.albumTracks = new ArrayList<Song>();
		String[] songTitles = new String[] { "Peter Piper", "Walk This Way", "It's Tricky" };

		// Loop over song titles and add new Songs to albumTracks.
		for (String songTitle : songTitles) {
			this.albumTracks.add(new Song(songTitle, "Run-D.M.C."));
		}

		return this.albumTracks;
	}
}
