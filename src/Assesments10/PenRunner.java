package Assesments10;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen=new Pen();
        pen.ink();
        pen.brand();
        pen.material();
        pen.retractable();
        pen.type();
        System.out.println("---------------");
        Pen pen1=new PenDetails();
        pen1.type();
        pen1.material();
        pen1.retractable();
        pen1.brand();
        pen1.ink();
        System.out.println("-------------");
        PenDetails penDetails=new PenDetails();
        penDetails.brand();
        penDetails.ink();
        penDetails.type();
        penDetails.material();
        penDetails.retractable();
    }
}
