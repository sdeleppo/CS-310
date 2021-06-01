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
	
	@Test //added by Sarah Deleppo
	public void testGetGorillazAlbumSize() throws NoSuchFieldException, SecurityException {
		 Gorillaz gorillazBand = new Gorillaz();	//create instance of Gorillaz class
		 ArrayList<Song> gorillazTracks = new ArrayList<Song>(); //create list for Gorillaz tracks
		 gorillazTracks = gorillazBand.getGorillazSongs(); //populate list with Gorillaz tracks from Gorillaz class
		 assertEquals(3, gorillazTracks.size()); //assert that there are 3 songs in track list
	}
	
	@Test //added by Sarah Deleppo
	public void testGetPhantogramAlbumSize() throws NoSuchFieldException, SecurityException {
		 Phantogram phantogramBand = new Phantogram();	//create instance of Phantogram class
		 ArrayList<Song> phantogramTracks = new ArrayList<Song>(); //create list for Phantogram tracks
		 phantogramTracks = phantogramBand.getPhantogramSongs(); //populate list with Phantogram tracks from Phantogram class
		 assertEquals(2, phantogramTracks.size()); //assert that there are 2 songs in track list
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

	@Test     // added by p.enkema
	public void testGetBurtBacharachAlbumSize() throws NoSuchFieldException, SecurityException {
		 BurtBacharach burtBacharach = new BurtBacharach();
		 ArrayList<Song> burtBacharachTracks = new ArrayList<Song>();
		 burtBacharachTracks = burtBacharach.getBurtBacharachSongs();
		 assertEquals(3, burtBacharachTracks.size());
	}

	@Test     // added by p.enkema
	public void testGetHerbAlpertAlbumSize() throws NoSuchFieldException, SecurityException {
		 HerbAlpert herbAlpert = new HerbAlpert();
		 ArrayList<Song> herbAlpertTracks = new ArrayList<Song>();
		 herbAlpertTracks = herbAlpert.getHerbAlpertSongs();
		 assertEquals(2, herbAlpertTracks.size());
	}
}
