
package Assesments10;

public class AudioCast {
    public void castAudio(Audio audio){
        audio.adjustVolume();
        audio.pause();
        audio.play();
        audio.resume();
        audio.stop();
        if(audio instanceof AudioDetails){
            System.out.println("casting audio");
            AudioDetails audioDetails=(AudioDetails)audio;
            audioDetails.sendAudio();
        }
    }
}
