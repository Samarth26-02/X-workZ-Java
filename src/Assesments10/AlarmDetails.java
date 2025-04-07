package Assesments10;

public class AlarmDetails extends Alarm{
    @Override
    public void arm() {
        System.out.println("Arming detailed alarm system");
    }

    @Override
    public void disarm() {
        System.out.println("Disarming detailed alarm system");
    }

    @Override
    public void trigger() {
        System.out.println("Triggering detailed alarm system");
    }

    @Override
    public void silence() {
        System.out.println("Silencing detailed alarm system");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking detailed alarm system status");
    }
    public void time(){
        System.out.println("time is running in alaramclock");
    }
}
