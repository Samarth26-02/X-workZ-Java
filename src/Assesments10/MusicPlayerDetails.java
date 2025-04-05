// MusicPlayerDetails.java
package Assesments10;

public class MusicPlayerDetails extends MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music with enhanced features");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music with details");
    }

    @Override
    public void next() {
        System.out.println("Playing next track with details");
    }

    @Override
    public void previous() {
        System.out.println("Playing previous track with details");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting volume with fine control");
    }
}