package Assesments10;

public class PrinterDetails extends Printer{
    @Override
    public void turnOn() {
        System.out.println("Turning detailed printer on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning detailed printer off");
    }

    @Override
    public void print() {
        System.out.println("Printing detailed document");
    }

    @Override
    public void checkPaper() {
        System.out.println("Checking detailed paper level");
    }

    @Override
    public void checkInk() {
        System.out.println("Checking detailed ink level");
    }

}
