package Assesments10;

public class AudioDetails extends Audio{
    @Override
    public void play() {
        System.out.println("Playing detailed audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing detailed audio");
    }

    @Override
    public void resume() {
        System.out.println("Resuming detailed audio");
    }

    @Override
    public void stop() {
        System.out.println("Stopping detailed audio");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting detailed audio volume");
    }
}
