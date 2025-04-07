package Assesments10;

public class AlarmCast {
    public void castAlarm(Alarm alarm){
        System.out.println("Alarm casting");
        alarm.arm();
        alarm.checkStatus();
        alarm.disarm();
        alarm.silence();
        alarm.trigger();
        if(alarm instanceof AlarmDetails){
            System.out.println("time running in casting");
            AlarmDetails alarmDetails=(AlarmDetails)alarm;
            alarmDetails.time();
        }
    }
}
