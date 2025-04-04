package Assesments10;

public class SunglassesRunner {
    public static void main(String[] args) {
        Sunglasses sunglasses=new Sunglasses();
        sunglasses.brand();
        sunglasses.frame();
        sunglasses.lens();
        sunglasses.style();
        sunglasses.uvprotection();
        System.out.println("---------");
        Sunglasses sunglasses1=new SunglassesDetails();
        sunglasses1.uvprotection();
        sunglasses1.lens();
        sunglasses1.style();
        sunglasses1.frame();
        sunglasses1.brand();
        System.out.println("-------------");
        SunglassesDetails sunglassesDetails=new SunglassesDetails();
        sunglassesDetails.brand();
        sunglassesDetails.lens();
        sunglassesDetails.frame();
        sunglassesDetails.style();
        sunglassesDetails.uvprotection();
    }
}
