package Assesments10;

public class DeviceRunner {
    public static void main(String[] args) {
        Device devices=new Device();
        devices.brand();
        devices.model();
        devices.powerOn();
        devices.price();
        devices.powerOff();
        System.out.println("-------------");
        Device devices1=new DeviceDetails();
        devices1.powerOn();
        devices1.brand();
        devices1.model();
        devices1.price();
        devices1.powerOff();
        System.out.println("-------------");
        DeviceDetails deviceDetails=new DeviceDetails();
        deviceDetails.brand();
        deviceDetails.model();
        deviceDetails.powerOff();
        deviceDetails.price();
        deviceDetails.powerOn();
    }
}
