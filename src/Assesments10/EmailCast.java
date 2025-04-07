package Assesments10;

public class EmailCast {
    public void castEmail(Email email) {
        email.send();
        email.receive();
        email.open();
        email.reply();
        email.forward();

        if (email instanceof EmailDetails) {
            System.out.println("Casting to EmailDetails...");
            EmailDetails details = (EmailDetails) email;
            details.flag();
        }
    }
}