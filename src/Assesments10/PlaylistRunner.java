// PlaylistRunner.java
package Assesments10;

public class PlaylistRunner {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong();
        playlist.removeSong();
        playlist.play();
        playlist.shuffle();
        playlist.viewSongs();

        System.out.println("----------------------");

        Playlist playlist1 = new PlaylistDetails();
        playlist1.viewSongs();
        playlist1.shuffle();
        playlist1.play();
        playlist1.removeSong();
        playlist1.addSong();

        System.out.println("----------------------");

        PlaylistDetails playlistDetails = new PlaylistDetails();
        playlistDetails.addSong();
        playlistDetails.viewSongs();
        playlistDetails.shuffle();
        playlistDetails.play();
        playlistDetails.removeSong();
    }
}