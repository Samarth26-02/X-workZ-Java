package Assesments10;

public class SmartDeviceRunner {
    public static void main(String[] args) {
        SmartDevice smartDevice=new SmartDevice();
        smartDevice.turnOn();
        smartDevice.connectNetwork();
        smartDevice.sendFiles();
        smartDevice.recieveFiles();
        smartDevice.turnOff();
        System.out.println("-------------");
        SmartDevice smartDevice1=new SmartDeviceDetails();
        smartDevice1.turnOn();
        smartDevice1.connectNetwork();
        smartDevice1.sendFiles();
        smartDevice1.recieveFiles();
        smartDevice1.turnOff();
        System.out.println("-------------");
        SmartDeviceDetails smartDeviceDetails=new SmartDeviceDetails();
        smartDeviceDetails.connectNetwork();
        smartDeviceDetails.recieveFiles();
        smartDeviceDetails.turnOff();
        smartDeviceDetails.sendFiles();
        smartDeviceDetails.turnOn();
    }
}
