// AlarmClockRunner.java
package Assesments10;

public class AlarmClockRunner {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setAlarm();
        clock.snooze();
        clock.stopAlarm();
        clock.viewAlarm();
        clock.changeTime();

        System.out.println("----------------------");

        AlarmClock clock1 = new AlarmClockDetails();
        clock1.changeTime();
        clock1.viewAlarm();
        clock1.stopAlarm();
        clock1.snooze();
        clock1.setAlarm();

        System.out.println("----------------------");

        AlarmClockDetails clockDetails = new AlarmClockDetails();
        clockDetails.setAlarm();
        clockDetails.changeTime();
        clockDetails.viewAlarm();
        clockDetails.stopAlarm();
        clockDetails.snooze();
    }
}