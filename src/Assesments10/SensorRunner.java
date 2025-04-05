package Assesments10;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.activate();
        sensor.readData();
        sensor.calibrate();
        sensor.deactivate();
        sensor.reportStatus();

        System.out.println("----------------------");

        Sensor sensor1 = new SensorDetails();
        sensor1.reportStatus();
        sensor1.deactivate();
        sensor1.calibrate();
        sensor1.readData();
        sensor1.activate();

        System.out.println("----------------------");

        SensorDetails sensorDetails = new SensorDetails();
        sensorDetails.activate();
        sensorDetails.reportStatus();
        sensorDetails.deactivate();
        sensorDetails.calibrate();
        sensorDetails.readData();
    }
}
