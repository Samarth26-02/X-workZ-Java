package Assesments10;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow=new Pillow();
        pillow.cover();
        pillow.firmness();
        pillow.hypoallergenic();
        pillow.size();
        pillow.material();
        System.out.println("-----------");
        Pillow pillow1=new PillowDetails();
        pillow1.material();
        pillow1.size();
        pillow1.hypoallergenic();
        pillow1.firmness();
        pillow1.cover();
        System.out.println("-------------");
        PillowDetails pillowDetails=new PillowDetails();
        pillowDetails.cover();
        pillowDetails.size();
        pillowDetails.firmness();
        pillowDetails.material();
        pillowDetails.hypoallergenic();
    }
}
