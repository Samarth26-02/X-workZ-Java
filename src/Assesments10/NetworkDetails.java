package Assesments10;

public class NetworkDetails extends Network{
    @Override
    public void connect() {
        System.out.println("Connecting to detailed network");
    }

    @Override
    public void transmit() {
        System.out.println("Transmitting detailed data");
    }

    @Override
    public void receive() {
        System.out.println("Receiving detailed data");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from detailed network");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking detailed network status");
    }
}
