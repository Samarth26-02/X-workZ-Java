// PlaylistDetails.java
package Assesments10;

public class PlaylistDetails extends Playlist {
    @Override
    public void addSong() {
        System.out.println("Adding detailed song to playlist");
    }

    @Override
    public void removeSong() {
        System.out.println("Removing detailed song from playlist");
    }

    @Override
    public void play() {
        System.out.println("Playing detailed playlist");
    }

    @Override
    public void shuffle() {
        System.out.println("Shuffling detailed playlist");
    }

    @Override
    public void viewSongs() {
        System.out.println("Viewing detailed songs in playlist");
    }
}