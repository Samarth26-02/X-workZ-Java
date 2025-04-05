// AlarmClockDetails.java
package Assesments10;

public class AlarmClockDetails extends AlarmClock {
    @Override
    public void setAlarm() {
        System.out.println("Setting alarm with detailed options");
    }

    @Override
    public void snooze() {
        System.out.println("Snoozing alarm with details");
    }

    @Override
    public void stopAlarm() {
        System.out.println("Stopping alarm with details");
    }

    @Override
    public void viewAlarm() {
        System.out.println("Viewing detailed alarm time");
    }

    @Override
    public void changeTime() {
        System.out.println("Changing current time with details");
    }
}