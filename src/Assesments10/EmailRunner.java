// EmailRunner.java
package Assesments10;

public class EmailRunner {
    public static void main(String[] args) {
        Email email = new Email();
        email.send();
        email.receive();
        email.open();
        email.reply();
        email.forward();

        System.out.println("----------------------");

        Email email1 = new EmailDetails();
        email1.forward();
        email1.reply();
        email1.open();
        email1.receive();
        email1.send();

        System.out.println("----------------------");

        EmailDetails emailDetails = new EmailDetails();
        emailDetails.send();
        emailDetails.forward();
        emailDetails.reply();
        emailDetails.open();
        emailDetails.receive();
        emailDetails.flag();

        System.out.println("----------------------");

        EmailCast emailCast = new EmailCast();
        emailCast.castEmail(email);
        System.out.println("----------------------");
        emailCast.castEmail(emailDetails);
    }
}