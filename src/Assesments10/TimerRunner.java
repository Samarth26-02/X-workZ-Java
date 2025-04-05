// TimerRunner.java
package Assesments10;

public class TimerRunner {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
        timer.stop();
        timer.reset();
        timer.lap();
        timer.displayTime();

        System.out.println("----------------------");

        Timer timer1 = new TimerDetails();
        timer1.displayTime();
        timer1.lap();
        timer1.reset();
        timer1.stop();
        timer1.start();

        System.out.println("----------------------");

        TimerDetails timerDetails = new TimerDetails();
        timerDetails.start();
        timerDetails.displayTime();
        timerDetails.lap();
        timerDetails.reset();
        timerDetails.stop();
    }
}