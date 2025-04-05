// PrinterRunner.java
package Assesments10;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.turnOn();
        printer.turnOff();
        printer.print();
        printer.checkPaper();
        printer.checkInk();

        System.out.println("----------------------");

        Printer printer1 = new PrinterDetails();
        printer1.checkInk();
        printer1.checkPaper();
        printer1.print();
        printer1.turnOff();
        printer1.turnOn();

        System.out.println("----------------------");

        PrinterDetails printerDetails = new PrinterDetails();
        printerDetails.turnOn();
        printerDetails.checkInk();
        printerDetails.checkPaper();
        printerDetails.print();
        printerDetails.turnOff();
    }
}