// PostRunner.java
package Assesments10;

public class PostRunner {
    public static void main(String[] args) {
        Post post = new Post();
        post.create();
        post.share();
        post.like();
        post.comment();
        post.delete();

        System.out.println("----------------------");

        Post post1 = new PostDetails();
        post1.delete();
        post1.comment();
        post1.like();
        post1.share();
        post1.create();

        System.out.println("----------------------");

        PostDetails postDetails = new PostDetails();
        postDetails.create();
        postDetails.delete();
        postDetails.comment();
        postDetails.like();
        postDetails.share();
    }
}