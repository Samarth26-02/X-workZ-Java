// MusicPlayerRunner.java
package Assesments10;

public class MusicPlayerRunner {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.pause();
        player.next();
        player.previous();
        player.adjustVolume();

        System.out.println("----------------------");

        MusicPlayer player1 = new MusicPlayerDetails();
        player1.adjustVolume();
        player1.previous();
        player1.next();
        player1.pause();
        player1.play();

        System.out.println("----------------------");

        MusicPlayerDetails playerDetails = new MusicPlayerDetails();
        playerDetails.play();
        playerDetails.adjustVolume();
        playerDetails.previous();
        playerDetails.next();
        playerDetails.pause();
    }
}