package Assesments10;

public class VideoDetails extends Video{
    @Override
    public void play() {
        System.out.println("Playing detailed video");
    }

    @Override
    public void pause() {
        System.out.println("Pausing detailed video");
    }

    @Override
    public void resume() {
        System.out.println("Resuming detailed video");
    }

    @Override
    public void stop() {
        System.out.println("Stopping detailed video");
    }

    @Override
    public void seek() {
        System.out.println("Seeking detailed video");
    }
}
