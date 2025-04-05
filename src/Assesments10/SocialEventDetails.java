// SocialEventDetails.java
package Assesments10;

public class SocialEventDetails extends SocialEvent {
    @Override
    public void planEvent() {
        System.out.println("Planning the social event with detailed logistics");
    }

    @Override
    public void inviteGuests() {
        System.out.println("Inviting guests with personalized messages");
    }

    @Override
    public void manageRSVPs() {
        System.out.println("Managing RSVPs and dietary restrictions");
    }

    @Override
    public void sendReminders() {
        System.out.println("Sending event reminders with location details");
    }

    @Override
    public void concludeEvent() {
        System.out.println("Concluding the event and sending thank you notes");
    }
}