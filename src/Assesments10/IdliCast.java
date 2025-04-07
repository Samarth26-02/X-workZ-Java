package Assesments10;

public class IdliCast {
    public void castIdli(Idli idli) {
        idli.ingridients();
        idli.texture();
        idli.servedWith();
        idli.preparation();
        idli.taste();

        if (idli instanceof IdliDetails) {
            System.out.println("Casting to IdliDetails...");
            IdliDetails details = (IdliDetails) idli;
            details.addGhee();
        }
    }
}