package Assesments10;

public class AudioRunner {
    public static void main(String[] args) {
        Audio audio = new Audio();
        audio.play();
        audio.pause();
        audio.resume();
        audio.stop();
        audio.adjustVolume();

        System.out.println("----------------------");

        Audio audio1 = new AudioDetails();
        audio1.adjustVolume();
        audio1.stop();
        audio1.resume();
        audio1.pause();
        audio1.play();

        System.out.println("----------------------");

        AudioDetails audioDetails = new AudioDetails();
        audioDetails.play();
        audioDetails.adjustVolume();
        audioDetails.stop();
        audioDetails.resume();
        audioDetails.pause();
        System.out.println("----------------------");
        AudioCast audioCast=new AudioCast();
        audioCast.castAudio(audio);
    }
}
