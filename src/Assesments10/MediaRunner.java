package Assesments10;

public class MediaRunner {
    public static void main(String[] args) {
        Media media = new Media();
        media.upload();
        media.play();
        media.pause();
        media.stop();
        media.download();

        System.out.println("----------------------");

        Media media1 = new MediaDetails();
        media1.download();
        media1.stop();
        media1.pause();
        media1.play();
        media1.upload();

        System.out.println("----------------------");

        MediaDetails mediaDetails = new MediaDetails();
        mediaDetails.upload();
        mediaDetails.download();
        mediaDetails.stop();
        mediaDetails.pause();
        mediaDetails.play();
    }
}
