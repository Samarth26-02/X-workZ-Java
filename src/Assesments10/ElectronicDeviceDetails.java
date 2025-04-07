package Assesments10;

public class ElectronicDeviceDetails extends ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is powering on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is shutting down");
    }

    @Override
    public void operate() {
        System.out.println("Smartphone is running apps and tasks");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone is connecting to a network");
    }

    @Override
    public void disconnect() {
        System.out.println("Smartphone is disconnecting from the network");
    }

    public void deviceType() {
        System.out.println("This is a handheld electronic device");
    }
}
