package Assesments10;

public class DeviceDetails extends Device {
    @Override
    public void powerOn() {
        System.out.println("Powering on the detailed device");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off the detailed device");
    }

    @Override
    public void model() {
        System.out.println("Detailed model of device");
    }

    @Override
    public void price() {
        System.out.println("Detailed price of device");
    }

    @Override
    public void brand() {
        System.out.println("Detailed brand of device");
    }

    public void deviceWarranty() {
        System.out.println("Showing device warranty information");
    }
}
