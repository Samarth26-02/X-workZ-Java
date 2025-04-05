// SocialMediaAccountRunner.java
package Assesments10;

public class SocialMediaAccountRunner {
    public static void main(String[] args) {
        SocialMediaAccount account = new SocialMediaAccount();
        account.createProfile();
        account.postMessage();
        account.followUser();
        account.unfollowUser();
        account.viewProfile();

        System.out.println("----------------------");

        SocialMediaAccount account1 = new SocialMediaAccountDetails();
        account1.viewProfile();
        account1.unfollowUser();
        account1.followUser();
        account1.postMessage();
        account1.createProfile();

        System.out.println("----------------------");

        SocialMediaAccountDetails accountDetails = new SocialMediaAccountDetails();
        accountDetails.createProfile();
        accountDetails.viewProfile();
        accountDetails.unfollowUser();
        accountDetails.followUser();
        accountDetails.postMessage();
    }
}