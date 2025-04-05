// PostDetails.java
package Assesments10;

public class PostDetails extends Post {
    @Override
    public void create() {
        System.out.println("Creating detailed post");
    }

    @Override
    public void share() {
        System.out.println("Sharing detailed post");
    }

    @Override
    public void like() {
        System.out.println("Liking detailed post");
    }

    @Override
    public void comment() {
        System.out.println("Commenting on detailed post");
    }

    @Override
    public void delete() {
        System.out.println("Deleting detailed post");
    }
}