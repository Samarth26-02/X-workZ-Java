package Assesments10;

public class IdliRunner {
    public static void main(String[] args) {
        Idli idli=new Idli();
        idli.ingridients();
        idli.preparation();
        idli.servedWith();
        idli.taste();
        idli.texture();
        System.out.println("-------------");
        Idli idli1=new IdliDetails();
        idli1.texture();
        idli1.taste();
        idli1.servedWith();
        idli1.preparation();
        idli1.ingridients();
        System.out.println("-------------");
        IdliDetails idliDetails=new IdliDetails();
        idliDetails.ingridients();
        idliDetails.taste();
        idliDetails.texture();
        idliDetails.preparation();
        idliDetails.servedWith();
    }
}
