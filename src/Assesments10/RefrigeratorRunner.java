package Assesments10;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator refrigerator=new Refrigerator();
        refrigerator.color();
        refrigerator.capacity();
        refrigerator.energyStar();
        refrigerator.freezer();
        refrigerator.type();
        System.out.println("-------------");
        Refrigerator refrigerator1=new RefrigeratorDetails();
        refrigerator1.type();
        refrigerator1.freezer();
        refrigerator1.energyStar();
        refrigerator1.color();
        refrigerator1.capacity();
        System.out.println("-------------");
        RefrigeratorDetails refrigeratorDetails=new RefrigeratorDetails();
        refrigeratorDetails.capacity();
        refrigeratorDetails.color();
        refrigeratorDetails.type();
        refrigeratorDetails.freezer();
        refrigeratorDetails.energyStar();
    }
}
