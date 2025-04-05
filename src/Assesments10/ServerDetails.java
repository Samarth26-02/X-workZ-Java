// ServerDetails.java
package Assesments10;

public class ServerDetails extends Server {
    @Override
    public void start() {
        System.out.println("Starting detailed server");
    }

    @Override
    public void stop() {
        System.out.println("Stopping detailed server");
    }

    @Override
    public void restart() {
        System.out.println("Restarting detailed server");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking detailed server status");
    }

    @Override
    public void deployApp() {
        System.out.println("Deploying detailed application");
    }
}