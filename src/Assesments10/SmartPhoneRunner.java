package Assesments10;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        Smartphone smartphone=new Smartphone();
        smartphone.brand();
        smartphone.model();
        smartphone.size();
        smartphone.storage();
        smartphone.os();
        System.out.println("------------");
        Smartphone smartphone1=new SmartphoneDetails();
        smartphone1.brand();
        smartphone1.model();
        smartphone1.size();
        smartphone1.storage();
        smartphone1.os();
        System.out.println("-------------");
        SmartphoneDetails smartphoneDetails=new SmartphoneDetails();
        smartphoneDetails.brand();
        smartphoneDetails.os();
        smartphoneDetails.model();
        smartphoneDetails.size();
        smartphoneDetails.storage();
    }
}
