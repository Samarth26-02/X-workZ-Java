package Assesments10;

public class ChairCast {
    public void castChair(Chair chair) {
        chair.material();
        chair.type();
        chair.adjustableHeight();
        chair.color();
        chair.hasArmrests();

        if (chair instanceof ChairDetails) {
            System.out.println("chair casting");
            ChairDetails chairDetails = (ChairDetails) chair;
            chairDetails.recliningFeature();
        }
    }
}
