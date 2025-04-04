package Assesments10;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar=new Guitar();
        guitar.brand();
        guitar.color();
        guitar.material();
        guitar.strings();
        guitar.type();
        System.out.println("---------------");
        Guitar guitar1=new GuitarDetails();
        guitar1.type();
        guitar1.strings();
        guitar1.color();
        guitar1.brand();
        guitar1.material();
        System.out.println("-------------");
        GuitarDetails guitarDetails=new GuitarDetails();
        guitarDetails.brand();
        guitarDetails.color();
        guitarDetails.type();
        guitarDetails.strings();
        guitarDetails.material();
    }
}
