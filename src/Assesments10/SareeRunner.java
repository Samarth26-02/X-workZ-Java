package Assesments10;

public class SareeRunner {
    public static void main(String[] args) {
        Saree saree=new Saree();
        saree.color();
        saree.border();
        saree.length();
        saree.material();
        saree.pattern();
        System.out.println("------------");
        Saree saree1=new SareeDetails();
        saree1.pattern();
        saree1.length();
        saree1.material();
        saree1.border();
        saree1.color();
        System.out.println("-------------");
        SareeDetails sareeDetails=new SareeDetails();
        sareeDetails.border();
        sareeDetails.color();
        sareeDetails.length();
        sareeDetails.pattern();
        sareeDetails.material();
    }
}
