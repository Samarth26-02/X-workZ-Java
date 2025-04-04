package Assesments10;

public class SmartDeviceDetails extends SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Device on");
    }
    @Override
    public void turnOff(){
        System.out.println("Device off");
    }
    @Override
    public void connectNetwork(){
        System.out.println("Connect to network");
    }
    @Override
    public void sendFiles(){
        System.out.println("Send files");
    }
    @Override
    public void recieveFiles(){
        System.out.println("Recieve Files");
    }
}
