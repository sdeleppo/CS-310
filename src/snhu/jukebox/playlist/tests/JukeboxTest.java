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

	
	@Test     // added by g.swortwood
	public void testGetInterpolAlbumSize() throws NoSuchFieldException, SecurityException {
		 Interpol interPol = new Interpol(); // create instance of Interpol class
		 ArrayList<Song> interPolTracks = new ArrayList<Song>(); // create list for Interpol class
		 interPolTracks = interPol.getInterpolSongs(); // populate list with Interpol tracks from Interpol class
		 assertEquals(5, interPolTracks.size()); // assert there are 5 songs in track list
	}

	@Test //added by Kate Kowalyshyn
	public void testGetMorganWallenAlbumSize() throws NoSuchFieldException, SecurityException {
		 MorganWallen morganWallen = new MorganWallen();	//create instance of Morgan Wallen class
		 ArrayList<Song> morganWallenTracks = new ArrayList<Song>(); //create list for Morgan Wallen tracks
		 morganWallenTracks = morganWallen.getMorganWallenSongs(); //populate list with Morgan Wallen tracks from Morgan Wallen class
		 assertEquals(3, morganWallenTracks.size()); //assert that there are 3 songs in track list
	}
	@Test //added by Kate Kowalyshyn
	public void testGetEricChurchAlbumSize() throws NoSuchFieldException, SecurityException {
		 EricChurch ericChurch = new EricChurch();	//create instance of Eric Church class
		 ArrayList<Song> ericChurchTracks = new ArrayList<Song>(); //create list for Eric Church tracks
		 ericChurchTracks = ericChurch.getEricChurchSongs(); //populate list with Eric Church tracks from Eric Church class
		 assertEquals(2, ericChurchTracks.size()); //assert that there are 2 songs in track list
	}
	
	@Test
	public void testGetNirvanaAlbumSize() throws NoSuchFieldException, SecurityException {
		 Nirvana artist = new Nirvana(); // Declare and instantiate object of type Nirvana.
		 ArrayList<Song> songList = artist.getNirvanaSongs(); // Declare a song list and populate list via Nirvana class's getNirvanaSongs() method. 
		 assertEquals(3, songList.size()); // Assert that track list contains 3 songs.
	}
	
	@Test
	public void testGetRunDMCAlbumSize() throws NoSuchFieldException, SecurityException {
		 RunDMC artist = new RunDMC(); // Declare and instantiate object of type RunDMC.
		 ArrayList<Song> songList = artist.getRunDMCSongs(); // Declare a song list and populate list via RunDMC class's getRunDMC() method. 
		 assertEquals(3, songList.size()); // Assert that track list contains 3 songs.

	}
	
	@Test
	public void testGetForeverALetDownAlbumSize() throws NoSuchFieldException, SecurityException {
		ForeverALetDown artist = new ForeverALetDown(); // Create instance for ForeverALetDown class
		 ArrayList<Song> songList = artist.getForeverALetDownsSongs(); // Declare a song list and populate list via ForeverALetDown class using getForeverALetDownsSongs method
		 assertEquals(4, songList.size()); // Show that track list contains 4 songs.

	}
}
