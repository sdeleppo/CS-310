package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}

	@Test
	public void testGetBurtBacharachAlbumSize() throws NoSuchFieldException, SecurityException { // added by p.enkema
		 BurtBacharach burtBacharach = new BurtBacharach();
		 ArrayList<Song> burtBacharachTracks = new ArrayList<Song>();
		 burtBacharachTracks = burtBacharach.getBurtBacharachSongs();
		 assertEquals(3, burtBacharachTracks.size());
	}

	@Test
	public void testGetHerbAlpertAlbumSize() throws NoSuchFieldException, SecurityException {    // added by p.enkema
		 HerbAlpert herbAlpert = new HerbAlpert();
		 ArrayList<Song> herbAlpertTracks = new ArrayList<Song>();
		 herbAlpertTracks = herbAlpert.getHerbAlpertSongs();
		 assertEquals(2, herbAlpertTracks.size());
	}
}
