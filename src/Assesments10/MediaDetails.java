package Assesments10;

public class MediaDetails extends Media{
    @Override
    public void upload() {
        System.out.println("Uploading detailed media content");
    }

    @Override
    public void play() {
        System.out.println("Playing detailed media content");
    }

    @Override
    public void pause() {
        System.out.println("Pausing detailed media content");
    }

    @Override
    public void stop() {
        System.out.println("Stopping detailed media content");
    }

    @Override
    public void download() {
        System.out.println("Downloading detailed media content");
    }
}
