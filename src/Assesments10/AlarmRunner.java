package Assesments10;

public class AlarmRunner {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.arm();
        alarm.disarm();
        alarm.trigger();
        alarm.silence();
        alarm.checkStatus();

        System.out.println("----------------------");

        Alarm alarm1 = new AlarmDetails();
        alarm1.checkStatus();
        alarm1.silence();
        alarm1.trigger();
        alarm1.disarm();
        alarm1.arm();

        System.out.println("----------------------");

        AlarmDetails alarmDetails = new AlarmDetails();
        alarmDetails.arm();
        alarmDetails.checkStatus();
        alarmDetails.silence();
        alarmDetails.trigger();
        alarmDetails.disarm();
    }
}
