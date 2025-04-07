package Assesments10;

public class DeviceCast {
    public void castDevice(Device device) {
        device.powerOn();
        device.brand();
        device.model();
        device.price();
        device.powerOff();

        if (device instanceof DeviceDetails) {
            System.out.println("Casting to DeviceDetails...");
            DeviceDetails details = (DeviceDetails) device;
            details.deviceWarranty();
        }
    }
}
