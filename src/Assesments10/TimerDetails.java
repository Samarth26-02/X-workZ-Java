// TimerDetails.java
package Assesments10;

public class TimerDetails extends Timer {
    @Override
    public void start() {
        System.out.println("Starting timer with milliseconds");
    }

    @Override
    public void stop() {
        System.out.println("Stopping timer with milliseconds");
    }

    @Override
    public void reset() {
        System.out.println("Resetting timer with details");
    }

    @Override
    public void lap() {
        System.out.println("Recording detailed lap time");
    }

    @Override
    public void displayTime() {
        System.out.println("Displaying current time with milliseconds");
    }
}