// ServerRunner.java
package Assesments10;

public class ServerRunner {
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
        server.stop();
        server.restart();
        server.checkStatus();
        server.deployApp();

        System.out.println("----------------------");

        Server server1 = new ServerDetails();
        server1.deployApp();
        server1.checkStatus();
        server1.restart();
        server1.stop();
        server1.start();

        System.out.println("----------------------");

        ServerDetails serverDetails = new ServerDetails();
        serverDetails.start();
        serverDetails.deployApp();
        serverDetails.checkStatus();
        serverDetails.restart();
        serverDetails.stop();
    }
}