// SocialEventRunner.java
package Assesments10;

public class SocialEventRunner {
    public static void main(String[] args) {
        SocialEvent event = new SocialEvent();
        event.planEvent();
        event.inviteGuests();
        event.manageRSVPs();
        event.sendReminders();
        event.concludeEvent();

        System.out.println("----------------------");

        SocialEvent event1 = new SocialEventDetails();
        event1.concludeEvent();
        event1.sendReminders();
        event1.manageRSVPs();
        event1.inviteGuests();
        event1.planEvent();

        System.out.println("----------------------");

        SocialEventDetails eventDetails = new SocialEventDetails();
        eventDetails.planEvent();
        eventDetails.concludeEvent();
        eventDetails.sendReminders();
        eventDetails.manageRSVPs();
        eventDetails.inviteGuests();
    }
}