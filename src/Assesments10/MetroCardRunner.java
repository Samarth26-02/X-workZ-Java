package Assesments10;

public class MetroCardRunner {
    public static void main(String[] args) {
        MetroCard metroCard=new MetroCard();
        metroCard.color();
        metroCard.functionality();
        metroCard.issuingAuthority();
        metroCard.material();
        metroCard.validity();
        System.out.println("--------------");
        MetroCard metroCard1=new MetroCardDetails();
        metroCard1.validity();
        metroCard1.material();
        metroCard1.issuingAuthority();
        metroCard1.functionality();
        metroCard1.color();
        System.out.println("-------------");
        MetroCardDetails metroCardDetails=new MetroCardDetails();
        metroCardDetails.color();
        metroCardDetails.functionality();
        metroCardDetails.material();
        metroCardDetails.validity();
        metroCardDetails.issuingAuthority();
    }
}
