package Assesments10;

public class MangoRunner {
    public static void main(String[] args) {
        Mango mango=new Mango();
        mango.color();
        mango.origin();
        mango.season();
        mango.taste();
        mango.variety();
        System.out.println("----------");
        Mango mango1=new MangoDetails();
        mango1.variety();
        mango1.taste();
        mango1.season();
        mango1.origin();
        mango1.color();
        System.out.println("-------------");
        MangoDetails mangoDetails=new MangoDetails();
        mangoDetails.color();
        mangoDetails.origin();
        mangoDetails.season();
        mangoDetails.taste();
        mangoDetails.variety();
    }
}
