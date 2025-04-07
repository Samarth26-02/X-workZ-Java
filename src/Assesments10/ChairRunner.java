package Assesments10;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.material();
        chair.type();
        chair.adjustableHeight();
        chair.color();
        chair.hasArmrests();

        System.out.println("--------------");

        Chair chair1 = new ChairDetails();
        chair1.material();
        chair1.type();
        chair1.adjustableHeight();
        chair1.hasArmrests();
        chair1.color();

        System.out.println("--------------");

        ChairDetails chairDetails = new ChairDetails();
        chairDetails.adjustableHeight();
        chairDetails.color();
        chairDetails.type();
        chairDetails.material();
        chairDetails.hasArmrests();
        chairDetails.recliningFeature();

        System.out.println("--------------");

        ChairCast chairCast = new ChairCast();
        chairCast.castChair(chair);
        chairCast.castChair(chair1);
    }
}
