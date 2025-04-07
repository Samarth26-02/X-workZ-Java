package Assesments10;

public class AlarmClockCast {
    public void castAlarmClock(AlarmClock alarmClock){
        alarmClock.setAlarm();
        alarmClock.viewAlarm();
        alarmClock.changeTime();
        alarmClock.snooze();
        alarmClock.stopAlarm();
        if(alarmClock instanceof AlarmClockDetails){
            System.out.println("casting in alarmclock");
            AlarmClockDetails alarmClockDetails=(AlarmClockDetails)alarmClock;
            alarmClockDetails.setTime();
        }
    }
}
