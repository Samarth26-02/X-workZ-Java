package Assesments10;

public class DeviceRunner {
    public static void main(String[] args) {
        Devices devices=new Devices();
        devices.brand();
        devices.model();
        devices.powerOn();
        devices.price();
        devices.powerOff();
        System.out.println("-------------");
        Devices devices1=new DeviceDetails();
        devices1.powerOn();
        devices1.brand();
        devices1.model();
        devices1.price();
        devices1.powerOff();
    }
}
