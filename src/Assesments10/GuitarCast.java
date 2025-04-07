package Assesments10;

public class GuitarCast {
    public void castGuitar(Guitar guitar) {
        guitar.type();
        guitar.material();
        guitar.strings();
        guitar.color();
        guitar.brand();

        if (guitar instanceof GuitarDetails) {
            System.out.println("Casting to GuitarDetails...");
            GuitarDetails details = (GuitarDetails) guitar;
            details.play();
        }
    }
}