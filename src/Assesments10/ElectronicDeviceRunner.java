package Assesments10;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice genericDevice = new ElectronicDevice();
        genericDevice.turnOn();
        genericDevice.turnOff();
        genericDevice.operate();
        genericDevice.connect();
        genericDevice.disconnect();

        System.out.println("-------------");

        ElectronicDevice myPhone = new ElectronicDeviceDetails();
        myPhone.turnOn();
        myPhone.turnOff();
        myPhone.operate();
        myPhone.connect();
        myPhone.disconnect();

        System.out.println("-------------");

        ElectronicDeviceDetails electronicDeviceDetails = new ElectronicDeviceDetails();
        electronicDeviceDetails.connect();
        electronicDeviceDetails.operate();
        electronicDeviceDetails.turnOff();
        electronicDeviceDetails.disconnect();
        electronicDeviceDetails.turnOn();
        electronicDeviceDetails.deviceType();

        System.out.println("-------------");

        ElectronicDeviceCast edc = new ElectronicDeviceCast();
        edc.castDevice(genericDevice);         // no deviceType()
        System.out.println("-------------");
        edc.castDevice(electronicDeviceDetails); // with deviceType()
    }
}
