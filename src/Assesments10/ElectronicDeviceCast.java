package Assesments10;

public class ElectronicDeviceCast {
    public void castDevice(ElectronicDevice device) {
        device.turnOn();
        device.operate();
        device.connect();
        device.disconnect();
        device.turnOff();

        if (device instanceof ElectronicDeviceDetails) {
            System.out.println("Casting to ElectronicDeviceDetails...");
            ElectronicDeviceDetails details = (ElectronicDeviceDetails) device;
            details.deviceType();
        }
    }
}
