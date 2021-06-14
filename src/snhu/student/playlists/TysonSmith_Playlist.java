// Added by Tyson Smith

package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TysonSmith_Playlist {

    public LinkedList < PlayableSong > StudentPlaylist() {

        LinkedList < PlayableSong > playlist = new LinkedList < PlayableSong > ();

        // Eninem Songs
        ArrayList < Song > eminemTracks = new ArrayList < Song > ();
        Eminem eminem = new Eminem();
        eminemTracks = eminem.getEminemSongs();

        playlist.add(eminemTracks.get(1)); // Rap God

        // Paulo Londra songs
        ArrayList < Song > pauloLondraTracks = new ArrayList < Song > ();
        PauloLondra pauloLondra = new PauloLondra();
        pauloLondraTracks = pauloLondra.getPauloLondraSongs();

        playlist.add(pauloLondraTracks.get(0)); // Forever Alone
        playlist.add(pauloLondraTracks.get(1)); // Chica Paranormal
        playlist.add(pauloLondraTracks.get(2)); // Solo Pienso En Ti
        playlist.add(pauloLondraTracks.get(3)); // Querido Amigo

        // Eric Church Songs
        ArrayList < Song > ericChurchTracks = new ArrayList < Song > ();
        EricChurch ericChurch = new EricChurch();
        ericChurchTracks = ericChurch.getEricChurchSongs();

        playlist.add(ericChurchTracks.get(0)); // Heart on Fire

        return playlist;
    }
}
