// SocialMediaAccountDetails.java
package Assesments10;

public class SocialMediaAccountDetails extends SocialMediaAccount {
    @Override
    public void createProfile() {
        System.out.println("Creating detailed social media profile");
    }

    @Override
    public void postMessage() {
        System.out.println("Posting a detailed message");
    }

    @Override
    public void followUser() {
        System.out.println("Following another user with details");
    }

    @Override
    public void unfollowUser() {
        System.out.println("Unfollowing a user with details");
    }

    @Override
    public void viewProfile() {
        System.out.println("Viewing detailed profile");
    }
}