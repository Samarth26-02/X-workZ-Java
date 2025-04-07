package Assesments10;

public class EmailDetails extends Email {
    @Override
    public void send() {
        System.out.println("Sending detailed email");
    }

    @Override
    public void receive() {
        System.out.println("Receiving detailed email");
    }

    @Override
    public void open() {
        System.out.println("Opening detailed email");
    }

    @Override
    public void reply() {
        System.out.println("Replying to detailed email");
    }

    @Override
    public void forward() {
        System.out.println("Forwarding detailed email");
    }

    public void flag() {
        System.out.println("Email flagged as important");
    }
}