package Assesments10;

public class NetworkRunner {
    public static void main(String[] args) {
        Network network = new Network();
        network.connect();
        network.transmit();
        network.receive();
        network.disconnect();
        network.checkStatus();

        System.out.println("----------------------");

        Network network1 = new NetworkDetails();
        network1.checkStatus();
        network1.disconnect();
        network1.receive();
        network1.transmit();
        network1.connect();

        System.out.println("----------------------");

        NetworkDetails networkDetails = new NetworkDetails();
        networkDetails.connect();
        networkDetails.checkStatus();
        networkDetails.disconnect();
        networkDetails.receive();
        networkDetails.transmit();
    }
}
