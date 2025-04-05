package Assesments10;

public class VideoRunner {
    public static void main(String[] args) {
        Video video = new Video();
        video.play();
        video.pause();
        video.resume();
        video.stop();
        video.seek();

        System.out.println("----------------------");

        Video video1 = new VideoDetails();
        video1.seek();
        video1.stop();
        video1.resume();
        video1.pause();
        video1.play();

        System.out.println("----------------------");

        VideoDetails videoDetails = new VideoDetails();
        videoDetails.play();
        videoDetails.seek();
        videoDetails.stop();
        videoDetails.resume();
        videoDetails.pause();
    }
}
