package Assesments10;

public class SensorDetails extends Sensor{
    @Override
    public void activate() {
        System.out.println("Activating detailed sensor");
    }

    @Override
    public void readData() {
        System.out.println("Reading detailed sensor data");
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating detailed sensor");
    }

    @Override
    public void deactivate() {
        System.out.println("Deactivating detailed sensor");
    }

    @Override
    public void reportStatus() {
        System.out.println("Reporting detailed sensor status");
    }
}
